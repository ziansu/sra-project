@java.lang.Override
protected java.lang.Object transformToSource(java.lang.Object o) {
    if (o != null) {
        java.util.Map<java.lang.String, java.lang.Object> valueMap = new java.util.HashMap<>();
        java.lang.Class<?> targetClass = getField().getAnnotation(sirius.search.annotations.NestedObject.class).value();
        for (java.lang.reflect.Field innerField : targetClass.getDeclaredFields()) {
            transformField(o, valueMap, innerField);
        }
        return valueMap;
    }else {
        return null;
    }
}