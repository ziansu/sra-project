public final void addAll(java.lang.String key, V[] values) {
    java.util.List<V> list = get(key);
    if (list == null) {
        list = new java.util.ArrayList<>();
        map.put(key, list);
    }
    java.util.Collections.addAll(list, values);
}