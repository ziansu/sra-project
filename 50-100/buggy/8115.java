@java.lang.Override
public boolean contains(final java.lang.Object o) {
    if (!(o instanceof java.util.Map.Entry))
        return false;
    
    final java.util.Map.Entry<?, ?> e = ((java.util.Map.Entry<?, ?>) (o));
    TypeV v = get(e.getKey());
    return v.equals(e.getValue());
}