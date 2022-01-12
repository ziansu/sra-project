public final V get(K key) {
    if (key == null) {
        throw new java.lang.NullPointerException("key == null");
    }
    V result;
    synchronized(this) {
        result = map.get(key);
        if (result != null) {
            return result;
        }
    }
    result = create(key);
    synchronized(this) {
        if (result != null) {
            map.put(key, result);
            trimToSize(maxSize);
        }
    }
    return result;
}