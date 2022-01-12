@java.lang.Override
public void channelRead(io.netty.channel.ChannelHandlerContext ctx, java.lang.Object msg) throws java.lang.Exception {
    final io.netty.buffer.ByteBuf in = ((io.netty.buffer.ByteBuf) (msg));
    final byte[] messageBytes = in.toString(io.netty.util.CharsetUtil.US_ASCII).getBytes();
    com.yumcouver.tunnel.client.serversocket.ListeningServer.getInstance().send(port, messageBytes);
    com.yumcouver.tunnel.client.serversocket.RequestHandler.LOGGER.info("Received message {}", com.yumcouver.tunnel.client.util.Wireshark.getSubstring(new java.lang.String(messageBytes)));
    io.netty.util.ReferenceCountUtil.release(msg);
}