@java.lang.Override
public final boolean remove(final java.lang.Object o) {
    com.github.veqryn.collect.AbstractBinaryTrie.Node<K, V> node = null;
    final java.util.Iterator<com.github.veqryn.collect.AbstractBinaryTrie.Node<K, V>> iter = new com.github.veqryn.collect.AbstractBinaryTrie.NodePrefixIterator<K, V>(trie, key, includePrefixOfKey, keyInclusive, includePrefixedByKey, canBeEmpty);
    while (iter.hasNext()) {
        node = iter.next();
        if (com.github.veqryn.collect.AbstractBinaryTrie.eq(node.value, o)) {
            trie.deleteNode(node);
            return true;
        }
    } 
    return false;
}