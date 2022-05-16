package com.deepblue.chapter_02;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.PathResource;

/**
 *
 */
public class MyTestBeanClient {

    public static void main(String[] args) {

        BeanFactory factory = new XmlBeanFactory(new PathResource("/Users/yangjianwei/IdeaProjects/spring_source/src/com/deepblue/chapter_02/application-bean.xml"));

        MyTestBean bean = (MyTestBean) factory.getBean("myTestBean");

        System.out.println(bean.getTestStr());

    }
}
