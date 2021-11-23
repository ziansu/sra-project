public void removeAndFail(java.lang.Throwable cause) {
    assert ctx.executor().inEventLoop();
    if (cause == null) {
        throw new java.lang.NullPointerException("cause");
    }
    io.netty.channel.PendingWriteQueue.PendingWrite write = head;
    if (write == null) {
        return ;
    }
    io.netty.util.ReferenceCountUtil.safeRelease(write.msg);
    io.netty.channel.ChannelPromise promise = write.promise;
    io.netty.channel.PendingWriteQueue.safeFail(promise, cause);
    recycle(write);
}