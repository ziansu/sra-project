public <S, T> org.apache.ofbiz.base.conversion.Converter<S, T> createConverter(java.lang.Class<S> sourceClass, java.lang.Class<T> targetClass) {
    if (((java.lang.String.class) == sourceClass) && (java.lang.Enum.class.isAssignableFrom(targetClass))) {
        return org.apache.ofbiz.base.util.UtilGenerics.cast(new org.apache.ofbiz.base.conversion.MiscConverters.StringToEnum<E>());
    }else {
        return null;
    }
}