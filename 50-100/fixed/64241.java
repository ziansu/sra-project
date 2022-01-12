@java.lang.Override
public void channelActive(io.netty.channel.ChannelHandlerContext ctx) throws java.lang.Exception {
    de.bluplayz.logger.Logger.log("Client connected successfully");
    channel = ctx.channel();
    for (de.bluplayz.networkhandler.netty.ConnectionListener handler : de.bluplayz.networkhandler.netty.NettyHandler.getConnectionListeners()) {
        handler.channelConnected(ctx);
    }
    de.bluplayz.networkhandler.netty.NettyHandler.getClients().put((("Channel" + (de.bluplayz.networkhandler.netty.NettyHandler.getClients().size())) + 1), ctx.channel());
}