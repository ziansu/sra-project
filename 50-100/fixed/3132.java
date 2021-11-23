public static <V> V getLast(java.util.List<V> list, V defaultValue) {
    if (list == null) {
        return defaultValue;
    }
    int size = list.size();
    if (size > 0) {
        return list.get((size - 1));
    }else {
        return defaultValue;
    }
}