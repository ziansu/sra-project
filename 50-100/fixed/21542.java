public io.netty.channel.ChannelPromise remove() {
    assert ctx.executor().inEventLoop();
    io.netty.channel.PendingWriteQueue.PendingWrite write = head;
    if (write == null) {
        return null;
    }
    io.netty.channel.ChannelPromise promise = write.promise;
    io.netty.util.ReferenceCountUtil.safeRelease(write.msg);
    recycle(write, true);
    return promise;
}