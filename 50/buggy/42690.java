@java.lang.Override
public void close(io.netty.channel.ChannelHandlerContext ctx, io.netty.channel.ChannelPromise future) throws java.lang.Exception {
    discardDeferred(ctx);
    super.close(ctx, future);
}