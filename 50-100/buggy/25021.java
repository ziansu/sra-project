@java.lang.Override
public void handlerRemoved(io.netty.channel.ChannelHandlerContext ctx) throws java.lang.Exception {
    SortServer.LOG.info("[END] The Client has been disconnected with Address: {}", ctx.channel().remoteAddress());
    com.main.ServerMain.ACTIVE_INSTANCES -= 1;
    com.main.ServerMain.N_INSTANCES -= 1;
    com.net.SortServerHandler.channels.remove(ctx.channel());
    super.handlerRemoved(ctx);
}