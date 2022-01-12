public V findValueFromKey(K key) {
    for (pack1.MapEnt<K, V> anInternalMap : internalMap) {
        if (anInternalMap.getKey().equals(key))
            return anInternalMap.getValue();
        
    }
    return null;
}