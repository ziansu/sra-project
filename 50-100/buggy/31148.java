public V get(K[] sequence) {
    if ((sequence.length) == 0)
        return value;
    
    K key = sequence[0];
    K[] subsequence = java.util.Arrays.copyOfRange(sequence, 1, sequence.length);
    for (encoder.Trie<K, V> child : children)
        if ((child.key) == key)
            return child.get(subsequence);
        
    
    return null;
}