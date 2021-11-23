protected <T> T createObjectForClass(java.lang.Class<T> aClass, java.util.Map<java.lang.Class<?>, java.lang.Object> valueMap) throws com.robertsmieja.test.utils.junit.exceptions.ObjectFactoryException {
    T object;
    object = com.robertsmieja.test.utils.junit.Internal.createObjectFromDefaultConstructor(aClass);
    java.util.List<java.lang.reflect.Field> fields = com.robertsmieja.test.utils.junit.GettersAndSettersUtils.getFields(aClass);
    for (java.lang.reflect.Field field : fields) {
        setValueForField(field, object, valueMap);
    }
    return object;
}