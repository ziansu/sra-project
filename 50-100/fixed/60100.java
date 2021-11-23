@java.lang.Override
public final void clear() {
    final java.util.Iterator<com.github.veqryn.collect.AbstractBinaryTrie.Node<K, V>> iter = new com.github.veqryn.collect.AbstractBinaryTrie.NodePrefixIterator<K, V>(trie, key, includePrefixOfKey, keyInclusive, includePrefixedByKey, canBeEmpty);
    while (iter.hasNext()) {
        iter.next();
        iter.remove();
    } 
}