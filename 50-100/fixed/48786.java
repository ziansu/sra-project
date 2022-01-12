public static <V> V getFirst(java.util.List<V> list, V defaultValue) {
    if (list == null) {
        return defaultValue;
    }
    int size = list.size();
    if (size > 0) {
        return list.get(0);
    }else {
        return defaultValue;
    }
}