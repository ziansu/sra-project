@java.lang.Override
public void channelInactive(io.netty.channel.ChannelHandlerContext ctx) {
    synchronized(this) {
        this.ctx = null;
    }
    java.net.InetSocketAddress inetSocketAddress = ((java.net.InetSocketAddress) (ctx.channel().remoteAddress()));
    com.yumcouver.tunnel.server.controller.ControllerServerHandlerAdapter.LOGGER.info("{}:{} disconnected", inetSocketAddress.getHostString(), inetSocketAddress.getPort());
    baseHandler.shutdown();
}