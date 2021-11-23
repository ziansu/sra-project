@java.lang.Override
public void channelInactive(io.netty.channel.ChannelHandlerContext ctx) throws java.lang.Exception {
    de.bluplayz.logger.Logger.log("disconnected from NettyServer");
    nettyClient.scheduleConnect(1000);
    channel = null;
    getNettyClient().setChannel(null);
    for (de.bluplayz.networkhandler.netty.ConnectionListener handler : de.bluplayz.networkhandler.netty.NettyHandler.getConnectionListeners()) {
        handler.channelDisconnected(ctx);
    }
}