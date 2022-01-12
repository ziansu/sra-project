@java.lang.Override
protected java.lang.Object transformToSource(java.lang.Object o) {
    java.util.Map<java.lang.String, java.lang.Object> valueMap = new java.util.HashMap<>();
    if (o != null) {
        java.lang.Class<?> targetClass = getField().getAnnotation(sirius.search.annotations.NestedObject.class).value();
        for (java.lang.reflect.Field innerField : targetClass.getDeclaredFields()) {
            transformField(o, valueMap, innerField);
        }
    }
    return valueMap;
}