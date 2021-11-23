public static <T> java.util.List<T> nullToEmptyList(java.util.Collection<T> newValue) {
    if (newValue == null) {
        return com.google.common.collect.Lists.newArrayList();
    }
    return com.google.common.collect.Lists.newArrayList(newValue);
}