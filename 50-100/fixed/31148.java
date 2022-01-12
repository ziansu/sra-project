public V get(java.util.List<K> sequence, int offset) {
    if ((sequence.size()) == offset)
        return value;
    
    K key = sequence.get(offset);
    for (encoder.Trie<K, V> child : children)
        if ((child.key) == key)
            return child.get(sequence, (offset + 1));
        
    
    return null;
}