java.lang.String getClassName(com.jsmartframework.web.annotation.AuthBean authBean, java.lang.Class<?> authClass) {
    java.lang.String beanName = authBean.name();
    if (org.apache.commons.lang.StringUtils.isBlank(beanName)) {
        beanName = getClassName(authClass.getSimpleName());
    }
    beanNames.put(authClass, beanName);
    return beanName;
}