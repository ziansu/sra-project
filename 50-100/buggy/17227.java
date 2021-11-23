@java.lang.Override
public void channelInactive(io.netty.channel.ChannelHandlerContext ctx) throws java.lang.Exception {
    org.eclipse.moquette.server.netty.NettyChannel channel = m_channelMapper.get(ctx);
    java.lang.String clientID = ((java.lang.String) (channel.getAttribute(NettyChannel.ATTR_KEY_CLIENTID)));
    try {
        if (null != clientID) {
            m_messaging.lostConnection(channel, clientID);
        }
    } catch (java.lang.Exception ex) {
        org.eclipse.moquette.server.netty.NettyMQTTHandler.LOG.error("clean resource error!!!", ex);
    }
    ctx.close();
    synchronized(m_channelMapper) {
        m_channelMapper.remove(ctx);
    }
}