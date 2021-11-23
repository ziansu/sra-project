@java.lang.Override
protected java.util.Set<?> generateValue(final java.lang.reflect.Type type, final java.lang.Object... vals) {
    java.util.Set<java.lang.Object> newList = com.google.common.collect.Sets.newHashSet();
    try {
        newList = ((java.util.Set<java.lang.Object>) (type.getClass().newInstance()));
    } catch (java.lang.InstantiationException | java.lang.IllegalAccessException e) {
    }
    java.util.Collections.addAll(newList, vals);
    return newList;
}