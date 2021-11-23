public boolean offerAll(E[] items, int length) {
    long seq = sequenceArray.getAndAdd(com.hazelcast.internal.util.Ringbuffer.TAIL_INDEX, length);
    for (int itemsIndex = 0; itemsIndex < length; itemsIndex++) {
        E item = items[itemsIndex];
        items[itemsIndex] = null;
        array.lazySet(index(seq), item);
        seq++;
    }
    return true;
}