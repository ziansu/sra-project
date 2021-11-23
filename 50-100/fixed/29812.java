@java.lang.Override
public final boolean contains(final java.lang.Object o) {
    if (!(o instanceof java.util.Map.Entry)) {
        return false;
    }
    final java.util.Map.Entry<?, ?> e = ((java.util.Map.Entry<?, ?>) (o));
    if ((e.getKey()) == null) {
        return false;
    }
    final V v = get(e.getKey());
    return (v != null) && (v.equals(e.getValue()));
}