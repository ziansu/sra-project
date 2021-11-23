@java.lang.Override
public V remove(java.lang.Object key) {
    com.n247s.util.collection.ListMap.ListMapEntry<K, V> entry;
    for (int i = 0; i < (this.size()); i++) {
        entry = this.entrySet.entryList.get(i);
        if (entry.compareKey(key)) {
            V value = entry.getValue();
            this.remove(i);
            return value;
        }
    }
    throw new java.lang.NullPointerException("Couldn't find the given key!");
}