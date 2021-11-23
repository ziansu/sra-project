public final synchronized V get(K key) {
    if (key == null) {
        throw new java.lang.NullPointerException("key == null");
    }
    V result = map.get(key);
    if (result != null) {
        return result;
    }
    result = create(key);
    if (result != null) {
        map.put(key, result);
        trimToSize(maxSize);
    }
    return result;
}