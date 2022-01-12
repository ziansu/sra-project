private io.traffic.shm.queue.Block read(long offset) {
    io.traffic.shm.queue.Block block = io.traffic.shm.queue.Block.load(capacity, Metadata.READ_INITIAL_VALUE, address, (offset + (Constant.INT_SIZE)));
    long shift = offset + (block.sizeof());
    if (shift > (capacity)) {
        metadata.setMode(false);
        shift = (Metadata.DATA_OFFSET) + (shift % (capacity));
    }
    if (readCursor.update(offset, shift)) {
        return block;
    }
    return null;
}