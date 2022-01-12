@java.lang.Override
public void channelInactive(io.netty.channel.ChannelHandlerContext ctx) throws java.lang.Exception {
    org.eclipse.moquette.server.netty.NettyChannel channel = m_channelMapper.get(ctx);
    try {
        java.lang.Object clientID = channel.getAttribute(NettyChannel.ATTR_KEY_CLIENTID);
        if (null != clientID) {
            m_messaging.lostConnection(channel, ((java.lang.String) (clientID)));
        }
    } catch (java.lang.Exception ex) {
        org.eclipse.moquette.server.netty.NettyMQTTHandler.LOG.error("clean resource error!!!", ex);
    }
    ctx.close();
    synchronized(m_channelMapper) {
        m_channelMapper.remove(ctx);
    }
}