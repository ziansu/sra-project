private void recycle(io.netty.channel.PendingWriteQueue.PendingWrite write, boolean update) {
    final io.netty.channel.PendingWriteQueue.PendingWrite next = write.next;
    final long writeSize = write.size;
    if (update) {
        if (next == null) {
            head = tail = null;
            size = 0;
        }else {
            head = next;
            (size)--;
            assert (size) > 0;
        }
    }
    write.recycle();
    buffer.decrementPendingOutboundBytes(writeSize);
}