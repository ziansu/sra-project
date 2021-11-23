public V putIfAbsent(K key, V value) {
    return put(key, value, this.defaultExpiration);
}