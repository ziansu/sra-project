@java.lang.Override
public final void clear() {
    final java.util.Iterator<com.github.veqryn.collect.Node<K, V>> iter = new NodePrefixSubMapIterator(key, includePrefixOfKey, keyInclusive, includePrefixedByKey, canBeEmpty);
    while (iter.hasNext()) {
        iter.next();
        iter.remove();
    } 
}