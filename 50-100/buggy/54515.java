@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
public java.util.Comparator<java.util.Map.Entry<K, V>> comparator() {
    if ((parentMap.comparator()) == null) {
        return ( a, b) -> Equator.ComparisonContext.DEFAULT_COMPARATOR.compare(((java.lang.Comparable) (a.getKey())), ((java.lang.Comparable) (b.getKey())));
    }
    return ( o1, o2) -> parentMap.comparator().compare(o1.getKey(), o2.getKey());
}