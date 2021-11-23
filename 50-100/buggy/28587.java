protected <T> T getValueFromMapOrDefaultMap(java.lang.Class<T> fieldClass, java.util.Map<java.lang.Class<?>, java.lang.Object> valueMap) {
    java.lang.Class<?> nonPrimitiveClass = com.robertsmieja.test.utils.junit.GenericObjectFactory.convertPrimitiveToWrapperOrReturn(fieldClass);
    java.util.Map<java.lang.Class<?>, java.lang.Object> defaultValueMap = getCorrectDefaultValueMapFromClassMap(valueMap);
    java.lang.Object value = valueMap.getOrDefault(nonPrimitiveClass, defaultValueMap.get(nonPrimitiveClass));
    T castedValue = ((T) (value));
    return castedValue;
}