@java.lang.Override
public final boolean remove(final java.lang.Object o) {
    com.github.veqryn.collect.Node<K, V> node = null;
    final java.util.Iterator<com.github.veqryn.collect.Node<K, V>> iter = new NodePrefixSubMapIterator(key, includePrefixOfKey, keyInclusive, includePrefixedByKey, canBeEmpty);
    while (iter.hasNext()) {
        node = iter.next();
        if (java.util.AbstractMap.eq(node.value, o)) {
            m.deleteNode(node);
            return true;
        }
    } 
    return false;
}