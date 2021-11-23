protected java.lang.Object getValueFromMapOrDefaultMap(java.lang.Class<?> fieldClass, java.util.Map<java.lang.Class<?>, java.lang.Object> valueMap) {
    java.lang.Class<?> nonPrimitiveClass = com.robertsmieja.test.utils.junit.GenericObjectFactory.convertPrimitiveToWrapperOrReturn(fieldClass);
    java.util.Map<java.lang.Class<?>, java.lang.Object> defaultValueMap = getCorrectDefaultValueMapFromClassMap(valueMap);
    return valueMap.getOrDefault(nonPrimitiveClass, defaultValueMap.get(nonPrimitiveClass));
}