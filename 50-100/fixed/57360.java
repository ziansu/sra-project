@java.lang.Override
public void messageReceived(org.jboss.netty.channel.ChannelHandlerContext ctx, org.jboss.netty.channel.MessageEvent e) {
    net.floodlightcontroller.interceptor.SwitchChannelHandler.logger.debug("MessageReceived: ");
    org.jboss.netty.buffer.ChannelBuffer buf = ((org.jboss.netty.buffer.ChannelBuffer) (e.getMessage()));
    java.lang.String msg = new java.lang.String(buf.array());
    net.floodlightcontroller.interceptor.SwitchChannelHandler.logger.debug(msg);
    try {
        java.util.List<org.openflow.protocol.OFMessage> listMessages = factory.parseMessage(buf);
        handleMessage(listMessages, e.getChannel());
    } catch (org.openflow.protocol.factory.MessageParseException ex) {
        ex.printStackTrace();
    }
}