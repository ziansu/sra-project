@java.lang.Override
public void channelActive(io.netty.channel.ChannelHandlerContext ctx) throws java.lang.Exception {
    ctx.pipeline().remove(this);
    ctx.fireChannelActive();
    super.channelActive(ctx);
}