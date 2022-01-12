@java.lang.Override
public final boolean remove(final java.lang.Object o) {
    if (!(o instanceof java.util.Map.Entry)) {
        return false;
    }
    final java.util.Map.Entry<?, ?> e = ((java.util.Map.Entry<K, V>) (o));
    final java.lang.Object key = e.getKey();
    if (key == null) {
        return false;
    }
    final java.lang.Object value = e.getValue();
    if (value == null) {
        return false;
    }
    return this.remove(key, value);
}