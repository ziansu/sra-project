@java.lang.Override
public java.util.Collection<V> values() {
    return allKeys.stream().map(delegate::get).collect(java.util.stream.Collectors.toList());
}