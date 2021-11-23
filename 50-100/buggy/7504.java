@java.lang.SuppressWarnings(value = "unchecked")
public com.datastax.driver.core.TypeCodec getSerializer(java.lang.Class<? extends com.datastax.driver.core.TypeCodec> serializerClass, java.lang.Class valueClass) {
    if ((valueClass != null) && (valueClass.getClass().isEnum())) {
        return new com.appmetr.hercules.serializers.EnumSerializer(valueClass.getClass());
    }
    if (serializerClass != null) {
        return tryToCreateObject(serializerClass, valueClass);
    }else {
        return getSerializer(valueClass);
    }
}