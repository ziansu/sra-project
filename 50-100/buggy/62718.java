private void ensureCapacity(int len) {
    long remaining = (capacity) - (size);
    for (long toAllocate = len - remaining; toAllocate >= 0; toAllocate -= io.druid.io.OutputBytes.BUFFER_SIZE) {
        buffers.add(allocateBuffer());
    }
    if ((headBuffer.remaining()) == 0) {
        nextHead();
    }
    capacity += len;
}