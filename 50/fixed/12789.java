@java.lang.Override
public void operationComplete(org.jboss.netty.channel.ChannelFuture future) throws java.lang.Exception {
    channelClosedFuture.setSuccess();
    ctx.sendUpstream(e);
}