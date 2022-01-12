protected static java.lang.Object getPublicProperty(java.lang.Object bean, java.lang.String property) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
    if (bean instanceof java.util.Map<?, ?>) {
        return ((java.util.Map<?, ?>) (bean)).get(property);
    }else {
        return org.apache.commons.beanutils.PropertyUtils.getSimpleProperty(bean, property);
    }
}