public io.netty.channel.ChannelFuture removeAndWrite() {
    assert ctx.executor().inEventLoop();
    io.netty.channel.PendingWriteQueue.PendingWrite write = head;
    if (write == null) {
        return null;
    }
    java.lang.Object msg = write.msg;
    io.netty.channel.ChannelPromise promise = write.promise;
    recycle(write);
    return ctx.write(msg, promise);
}