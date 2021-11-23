@java.lang.Override
public V remove(K key) {
    com.jwetherell.algorithms.data_structures.Trie.Node node = trie.getNode(key);
    V value = null;
    if (node != null) {
        if (node instanceof com.jwetherell.algorithms.data_structures.TrieMap.TrieMapNode) {
            com.jwetherell.algorithms.data_structures.TrieMap.TrieMapNode<V> tmn = ((com.jwetherell.algorithms.data_structures.TrieMap.TrieMapNode<V>) (node));
            value = tmn.value;
        }
        trie.remove(node);
    }
    return value;
}