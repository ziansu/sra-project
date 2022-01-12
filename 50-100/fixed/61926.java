protected java.lang.Object initBean(java.lang.String beanId, java.lang.Class<?> beanClazz) {
    java.lang.Object beanObj = null;
    java.util.Map<java.lang.String, java.lang.Object> propertyValues = null;
    java.util.Map<java.lang.String, java.lang.Class<?>> propertyTypes = null;
    propertyValues = getBeanPropertyValues().get(beanId);
    propertyTypes = getBeanPropertyClazz().get(beanId);
    beanObj = initBeanProperties(beanClazz, beanId, propertyValues, propertyTypes);
    return beanObj;
}