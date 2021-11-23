@java.lang.Override
public void channelConnected(org.jboss.netty.channel.ChannelHandlerContext ctx, org.jboss.netty.channel.ChannelStateEvent e) throws java.lang.Exception {
    com.uoko.rpc.transport.MethodInfo rpcMethod = new com.uoko.rpc.transport.MethodInfo();
    rpcMethod.setMethodName(method.getName());
    rpcMethod.setParameterTypes(method.getParameterTypes());
    rpcMethod.setParameters(arguments);
    com.uoko.rpc.transport.Transporter transporter = new com.uoko.rpc.transport.Transporter(rpcMethod);
    e.getChannel().write(transporter);
}