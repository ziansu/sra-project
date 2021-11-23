public static io.netty.channel.Channel removeUserChannel(io.netty.channel.Channel proxyChannel, java.lang.String userId) {
    synchronized(proxyChannel) {
        return proxyChannel.attr(org.fengfei.lanproxy.server.ProxyChannelManager.USER_CHANNELS).get().remove(userId);
    }
}