private void postConstruct(java.lang.Object resource, org.apache.commons.configuration.Configuration config) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
    java.lang.reflect.Method[] methods = resource.getClass().getMethods();
    for (java.lang.reflect.Method method : methods) {
        javax.annotation.PostConstruct postConstructAnnotation = method.getAnnotation(javax.annotation.PostConstruct.class);
        if (postConstructAnnotation != null) {
            java.lang.Object[] args = new java.lang.Object[]{ config };
            method.invoke(resource, args);
        }
    }
}