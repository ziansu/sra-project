public V get(K key) {
    if (containsKey(key)) {
        return cacheMap.get(key).getValue();
    }
    return null;
}