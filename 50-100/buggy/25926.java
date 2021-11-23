private void allocateAndSlice(int capacity, int sliceSize) {
    io.netty.buffer.ChannelBuffer newSlab = create(order, capacity);
    slabs.add(newSlab);
    for (int j = 0; j < (newSlab.capacity()); j += sliceSize) {
        io.netty.buffer.ChannelBuffer aSlice = newSlab.slice(j, (j + sliceSize));
        buffers.add(new io.netty.buffer.pool.AbstractSlabChannelBufferPool.PooledChannelBuffer(aSlice));
    }
}