public boolean offer(E[] items) {
    long tail = sequenceArray.getAndAdd(com.hazelcast.internal.util.Ringbuffer.TAIL_INDEX, items.length);
    for (int k = 0; k < (items.length); k++) {
        E item = items[k];
        if (item == null) {
            break;
        }
        items[k] = null;
        int index = index(tail);
        buffer.lazySet(index, item);
        tail++;
    }
    return true;
}