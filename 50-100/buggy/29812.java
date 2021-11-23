@java.lang.Override
public final boolean contains(final java.lang.Object o) {
    if (!(o instanceof java.util.Map.Entry)) {
        return false;
    }
    final java.util.Map.Entry<K, V> e = ((java.util.Map.Entry<K, V>) (o));
    final K k = e.getKey();
    final V v = lookup(k);
    return v != null;
}