@java.lang.Override
public void channelReadComplete(io.netty.channel.ChannelHandlerContext ctx) throws java.lang.Exception {
    discardSomeReadBytes();
    flushIfNeeded(ctx);
    boolean read = readIfNeeded(ctx);
    firedChannelRead = false;
    if (!read) {
        ctx.fireChannelReadComplete();
    }
}