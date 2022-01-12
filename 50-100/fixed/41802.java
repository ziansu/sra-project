public boolean replaceKey(K key, K newKey) {
    for (com.n247s.util.collection.ListMap.ListMapEntry<K, V> entry : this.entrySet.entryList)
        if (entry.compareKey(key)) {
            entry.setKey(newKey);
            (this.modCount)++;
            return true;
        }
    
    return false;
}