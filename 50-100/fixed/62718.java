private void ensureCapacity(int len) {
    long remaining = (capacity) - (size);
    for (long toAllocate = len - remaining; toAllocate >= 0; toAllocate -= io.druid.io.OutputBytes.BUFFER_SIZE) {
        buffers.add(allocateBuffer());
        capacity += io.druid.io.OutputBytes.BUFFER_SIZE;
    }
    if ((headBuffer.remaining()) == 0) {
        nextHead();
    }
}