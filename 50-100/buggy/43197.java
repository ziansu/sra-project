@java.lang.Override
public V get(K key) {
    if (key == null) {
        throw new java.lang.IllegalArgumentException("null key");
    }
    java.util.List<com.killeent.Dictionary.HashDictionary.Entry<K, V>> bucket = table[hash(key)];
    for (com.killeent.Dictionary.HashDictionary.Entry<K, V> entry : bucket) {
        if (entry.key.equals(key)) {
            return entry.value;
        }
    }
    return null;
}