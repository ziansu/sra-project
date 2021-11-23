@java.lang.Override
public void channelRead(io.netty.channel.ChannelHandlerContext ctx, java.lang.Object msg) {
    if (msg instanceof io.netty.channel.socket.DatagramPacket) {
        io.netty.channel.socket.DatagramPacket datagram = ((io.netty.channel.socket.DatagramPacket) (msg));
        java.net.InetSocketAddress sender = datagram.sender();
        net.marfgamer.jraknet.RakNetPacket packet = new net.marfgamer.jraknet.RakNetPacket(datagram);
        this.causeAddress = sender;
        client.handleMessage(packet, sender);
        datagram.content().release();
    }
}