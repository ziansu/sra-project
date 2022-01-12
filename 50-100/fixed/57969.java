@java.lang.Override
public void messageReceived(org.jboss.netty.channel.ChannelHandlerContext ctx, org.jboss.netty.channel.MessageEvent e) throws java.lang.Exception {
    if ((e.getMessage()) instanceof com.uoko.rpc.transport.Transporter) {
        com.uoko.rpc.transport.Transporter transporter = ((com.uoko.rpc.transport.Transporter) (e.getMessage()));
        reulst = transporter.getMethodInfo().getResult();
    }
    e.getChannel().close();
}