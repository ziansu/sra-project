@java.lang.Override
public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
    return allKeys.stream().map(( k) -> new java.util.AbstractMap.SimpleEntry<>(k, delegate.get(k))).collect(java.util.stream.Collectors.toCollection(java.util.LinkedHashSet::new));
}