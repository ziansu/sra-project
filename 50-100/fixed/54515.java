@java.lang.Override
public int compare(java.util.Map.Entry<K, V> a, java.util.Map.Entry<K, V> b) {
    return Equator.ComparisonContext.DEFAULT_COMPARATOR.compare(((java.lang.Comparable) (a.getKey())), ((java.lang.Comparable) (b.getKey())));
}