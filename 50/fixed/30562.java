@java.lang.Override
public java.util.NavigableMap<K, V> create(java.lang.Object... entries) {
    java.util.NavigableMap<K, V> map = ((java.util.NavigableMap<K, V>) (delegate.create(entries)));
    return map.descendingMap();
}