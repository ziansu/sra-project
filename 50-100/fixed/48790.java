@java.lang.Override
public V remove(K key) {
    com.jwetherell.algorithms.data_structures.SkipList.Node<K> node = list.removeValue(key);
    V value = null;
    if (node instanceof com.jwetherell.algorithms.data_structures.SkipListMap.SkipListMapNode) {
        com.jwetherell.algorithms.data_structures.SkipListMap.SkipListMapNode<K, V> treeMapNode = ((com.jwetherell.algorithms.data_structures.SkipListMap.SkipListMapNode<K, V>) (node));
        value = treeMapNode.value;
        treeMapNode.data = null;
        treeMapNode.value = null;
    }
    return value;
}