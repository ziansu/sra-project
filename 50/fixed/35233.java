public com.vaadin.spring.annotation.SpringView getAnnotationOfBeanName(java.lang.String beanName) {
    return this.applicationContext.findAnnotationOnBean(beanName, com.vaadin.spring.annotation.SpringView.class);
}