@java.lang.Override
public V remove(K key) {
    com.jwetherell.algorithms.data_structures.BinarySearchTree.Node<K> node = tree.removeValue(key);
    V value = null;
    if (node instanceof com.jwetherell.algorithms.data_structures.TreeMap.TreeMapNode) {
        com.jwetherell.algorithms.data_structures.TreeMap.TreeMapNode<K, V> treeMapNode = ((com.jwetherell.algorithms.data_structures.TreeMap.TreeMapNode<K, V>) (node));
        value = treeMapNode.value;
    }
    return value;
}