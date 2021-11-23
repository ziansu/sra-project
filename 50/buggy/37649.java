public java.util.Optional<K> get(K key) {
    V value = map.get(key);
    if (value == null) {
        return java.util.Optional.empty();
    }
    return java.util.Optional.of(key);
}