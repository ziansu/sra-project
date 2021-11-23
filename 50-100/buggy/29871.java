@java.lang.Override
public final boolean remove(final java.lang.Object o) {
    if (!(o instanceof java.util.Map.Entry)) {
        return false;
    }
    final java.util.Map.Entry<K, V> e = ((java.util.Map.Entry<K, V>) (o));
    final K k = e.getKey();
    return null != (this.remove(k));
}