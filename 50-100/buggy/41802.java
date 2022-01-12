public void replaceKey(K key, K newKey) {
    for (com.n247s.util.collection.ListMap.ListMapEntry<K, V> entry : this.entrySet.entryList)
        if (entry.compareKey(key)) {
            entry.setKey(newKey);
            (this.modCount)++;
        }
    
    throw new java.lang.NullPointerException("Couldn't find the given key!");
}