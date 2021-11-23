@java.lang.Override
public int putAll(java.lang.Iterable<? extends com.carrotsearch.hppc.KTypeVTypeCursor<? extends KType, ? extends VType>> iterable) {
    final int count = size();
    for (com.carrotsearch.hppc.KTypeVTypeCursor<? extends KType, ? extends VType> c : iterable) {
        put(c.key, c.value);
    }
    return (size()) - count;
}