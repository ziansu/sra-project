public com.n247s.util.collection.ListMap.SubMap<K, V> subMap(K fromKey, K toKey) {
    if ((!(this.containsKey(fromKey))) || (!(this.containsKey(toKey))))
        throw new java.lang.NullPointerException("Couldn't find the given keys!");
    
    return this.subMap(fromKey, true, toKey, true);
}