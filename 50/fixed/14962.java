public V get(K key) {
    if (containsKey(key)) {
        return ((V) (cacheMap.get(key).getValue()));
    }
    return null;
}