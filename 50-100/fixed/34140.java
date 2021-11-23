private static <T> java.util.List<T> toList(T... objects) {
    if (((objects.length) == 1) && ((objects[0]) == null)) {
        return new java.util.ArrayList<T>();
    }
    java.util.ArrayList<T> list = new java.util.ArrayList<T>(java.util.Arrays.asList(objects));
    return list;
}