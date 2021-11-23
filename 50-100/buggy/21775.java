public <S, T> org.apache.ofbiz.base.conversion.Converter<S, T> createConverter(java.lang.Class<S> sourceClass, java.lang.Class<T> targetClass) {
    if (!(sourceClass.isArray())) {
        return null;
    }
    if (targetClass != (java.util.List.class)) {
        return null;
    }
    if (!((sourceClass.getComponentType()) instanceof java.lang.Object)) {
        return null;
    }
    return org.apache.ofbiz.base.util.UtilGenerics.cast(new org.apache.ofbiz.base.conversion.CollectionConverters.ArrayClassToList<S, T>(sourceClass, targetClass));
}