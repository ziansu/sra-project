public void sendMessage(java.lang.String ip, int port, java.lang.String msg) {
    try {
        java.net.SocketAddress remoteAddress = new java.net.InetSocketAddress(ip, port);
        io.netty.channel.ChannelFuture f = netty.NettyClient1.b.connect(remoteAddress).sync();
        io.netty.channel.Channel ch = f.channel();
        io.netty.channel.ChannelFuture lastWriteFuture = ch.writeAndFlush(io.netty.buffer.Unpooled.copiedBuffer((msg + "\r\n"), java.nio.charset.StandardCharsets.UTF_8));
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}