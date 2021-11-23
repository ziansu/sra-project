@java.lang.Override
public void channelInactive(io.netty.channel.ChannelHandlerContext ctx) throws java.lang.Exception {
    super.channelInactive(ctx);
    discardDeferred(ctx);
}