@java.lang.Override
public void channelInactive(org.eclipse.moquette.server.netty.ChannelHandlerContext ctx) throws java.lang.Exception {
    org.eclipse.moquette.server.netty.NettyMQTTHandler.LOG.debug("channelInactive");
    super.channelInactive(ctx);
    org.eclipse.moquette.server.netty.NettyChannel channel = m_channelMapper.get(getKey(ctx.channel()));
    if (null == channel) {
        ctx.close();
        return ;
    }
    remove(ctx.channel());
    release(channel);
    ctx.close();
}