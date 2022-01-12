private boolean isGetter(java.lang.reflect.Method method, java.lang.String fieldName) {
    return ((method.getName().startsWith("get")) || (method.getName().startsWith("is"))) && (method.getName().endsWith(org.redisson.liveobject.core.AccessorInterceptor.getFieldNameSuffix(fieldName)));
}