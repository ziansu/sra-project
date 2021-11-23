private void readIfNeeded(io.netty.channel.ChannelHandlerContext ctx) {
    if ((!(ctx.channel().config().isAutoRead())) && ((!(firedChannelRead)) || (!(handshakePromise.isDone())))) {
        ctx.read();
    }
}