@java.lang.Override
public V replace(K key, V value) {
    for (com.n247s.util.collection.ListMap.ListMapEntry<K, V> entry : this.entrySet.entryList)
        if (entry.compareKey(key)) {
            V oldValue = entry.setValue(value);
            (this.modCount)++;
            return oldValue;
        }
    
    return null;
}