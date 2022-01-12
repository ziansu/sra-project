public void addBeans(java.util.List<?> beans) {
    if (beans == null) {
        return ;
    }
    for (java.lang.Object bean : beans) {
        java.lang.String name = ((bean.getClass().getName()) + "#") + (org.springframework.util.ObjectUtils.getIdentityHexString(bean));
        this.beanFactory.addBean(name, bean);
    }
}