private boolean isSetter(java.lang.reflect.Method method, java.lang.String fieldName) {
    return method.getName().equals(("set" + (org.redisson.liveobject.core.AccessorInterceptor.getFieldNameSuffix(fieldName))));
}