private static <T> java.util.List<T> toList(T... objects) {
    java.util.ArrayList<T> list = new java.util.ArrayList<T>(objects.length);
    if (((objects.length) == 1) && ((objects[0]) == null)) {
        return list;
    }
    list.addAll(java.util.Arrays.asList(objects));
    return list;
}