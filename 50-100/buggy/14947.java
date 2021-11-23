@java.lang.Override
public int putAll(com.carrotsearch.hppc.KTypeVTypeAssociativeContainer<? extends KType, ? extends VType> container) {
    final int count = this.assigned;
    for (com.carrotsearch.hppc.KTypeVTypeCursor<? extends KType, ? extends VType> c : container) {
        put(c.key, c.value);
    }
    return (this.assigned) - count;
}