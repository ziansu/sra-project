@java.lang.Override
protected void channelRead0(io.netty.channel.ChannelHandlerContext ctx, io.netty.buffer.ByteBuf msg) throws java.lang.Exception {
    stream.write(msg.copy());
}