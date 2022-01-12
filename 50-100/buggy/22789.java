@java.lang.Override
public void channelActive(io.netty.channel.ChannelHandlerContext ctx) {
    try {
        remoteAddress = io.netty.channel.AbstractChannel.class.getDeclaredField("remoteAddress");
        getRemoteAddress().setAccessible(true);
    } catch (java.lang.Exception ex) {
        nz.co.lolnet.bungeeproxy.BungeeProxy.getInstance().getLogger().severe(((("Encountered an error processing 'channelActive' in '" + (getClass().getSimpleName())) + "' - ") + (ex.getMessage())));
        ex.printStackTrace();
    }
}