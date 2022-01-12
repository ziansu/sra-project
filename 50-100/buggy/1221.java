private static <K, V> void accumulate(java.util.Map<K, V> map, java.util.Map.Entry<? extends K, ? extends V> entry) {
    com.google.common.base.Preconditions.checkState((!(map.containsKey(entry.getKey()))), "Duplicate key %s", entry.getKey());
    map.put(entry.getKey(), entry.getValue());
}