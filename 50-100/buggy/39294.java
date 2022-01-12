private void checkCapacity(int neededBytes) {
    int capacity = buffer.capacity();
    int position = buffer.position();
    if ((capacity - position) < neededBytes) {
        buffer = java.nio.ByteBuffer.allocate(java.lang.Math.max((capacity * 2), (capacity + neededBytes))).put(buffer.array());
    }
}