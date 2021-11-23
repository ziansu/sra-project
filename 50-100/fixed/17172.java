public <S, T> org.apache.ofbiz.base.conversion.Converter<S, T> createConverter(java.lang.Class<S> sourceClass, java.lang.Class<T> targetClass) {
    if (org.apache.ofbiz.base.util.ObjectType.instanceOf(sourceClass, targetClass)) {
        return new org.apache.ofbiz.base.conversion.Converters.PassThruConverter<>(sourceClass, targetClass);
    }
    return null;
}