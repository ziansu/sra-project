public V setValue(K key, V value) {
    for (com.n247s.util.collection.ListMap.ListMapEntry<K, V> entry : this.entrySet.entryList)
        if (entry.compareKey(key)) {
            V oldValue = entry.setValue(value);
            (this.modCount)++;
            return oldValue;
        }
    
    throw new java.lang.NullPointerException("Couldn't find the given key!");
}