private boolean isGetter(java.lang.reflect.Method method, java.lang.String fieldName) {
    return (method.getName().equals(("get" + (org.redisson.liveobject.core.AccessorInterceptor.getFieldNameSuffix(fieldName))))) || (method.getName().equals(("is" + (org.redisson.liveobject.core.AccessorInterceptor.getFieldNameSuffix(fieldName)))));
}