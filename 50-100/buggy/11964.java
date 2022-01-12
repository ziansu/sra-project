private boolean readIfNeeded(io.netty.channel.ChannelHandlerContext ctx) {
    if ((!(ctx.channel().config().isAutoRead())) && ((!(firedChannelRead)) || (!(handshakePromise.isDone())))) {
        ctx.read();
        return true;
    }
    return false;
}