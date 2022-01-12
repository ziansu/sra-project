@java.lang.Override
public void close(io.netty.channel.ChannelHandlerContext ctx, io.netty.channel.ChannelPromise future) throws java.lang.Exception {
    if (trace) {
        log.trace("Deferred handler got channel close event [address={}]", id);
    }
    discardDeferred();
    super.close(ctx, future);
}