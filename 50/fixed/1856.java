@java.lang.Override
public void channelActive(io.netty.channel.ChannelHandlerContext ctx) throws java.lang.Exception {
    super.channelActive(ctx);
    ctx.writeAndFlush(io.netty.buffer.Unpooled.copiedBuffer("ALLSU", java.nio.charset.Charset.forName("ascii")));
}