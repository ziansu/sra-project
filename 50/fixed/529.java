public V add(K key, V value) {
    if ((super.put(key, value)) != null)
        throw new java.lang.RuntimeException(("Map already contains key value" + key));
    
    return null;
}