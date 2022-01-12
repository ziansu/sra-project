@java.lang.Override
public V put(K key, V value) throws java.lang.NullPointerException {
    if ((key == null) || (value == null))
        throw new java.lang.NullPointerException();
    
    V oldValue = null;
    for (ArrayBasedMap<K, V>.Pair pair : values) {
        if (pair.getKey().equals(key))
            oldValue = pair.getValue();
        
        pair.setValue(value);
    }
    values.add(new Pair(key, value));
    return oldValue;
}