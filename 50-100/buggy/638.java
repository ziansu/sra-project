private void recycle(io.netty.channel.PendingWriteQueue.PendingWrite write) {
    final io.netty.channel.PendingWriteQueue.PendingWrite next = write.next;
    final long writeSize = write.size;
    (size)--;
    if (next == null) {
        head = tail = null;
        assert (size) == 0;
    }else {
        head = next;
        assert (size) > 0;
    }
    write.recycle();
    buffer.decrementPendingOutboundBytes(writeSize);
}