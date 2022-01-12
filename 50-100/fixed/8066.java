@java.lang.SuppressWarnings(value = "unchecked")
private static <T> java.lang.Class<T>[] getParameterTypes(java.lang.Object... propertyValues) {
    java.lang.Class<T>[] parameterTypes = ((java.lang.Class<T>[]) (java.lang.reflect.Array.newInstance(java.lang.Class.class, propertyValues.length)));
    for (int i = 0; i < (propertyValues.length); i++) {
        parameterTypes[i] = ((java.lang.Class<T>) (propertyValues[i].getClass()));
    }
    return parameterTypes;
}