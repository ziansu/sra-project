@java.lang.Override
public boolean containsKey(K key) {
    boolean contains = false;
    for (pack1.MapEnt<K, V> anInternalMap : internalMap) {
        contains = (anInternalMap.getKey()) == key;
    }
    return contains;
}