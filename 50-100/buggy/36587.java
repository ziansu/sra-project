public void send(java.lang.String stringMsg) throws java.io.IOException {
    java.net.MulticastSocket socket = new java.net.MulticastSocket(this.multicastPort);
    byte[] message = stringMsg.getBytes(de.vistahr.network.Multicast.CHARSET);
    java.lang.String message64 = new sun.misc.BASE64Encoder().encode(stringMsg.getBytes(de.vistahr.network.Multicast.CHARSET));
    message = message64.getBytes(de.vistahr.network.Multicast.CHARSET);
    socket.send(new java.net.DatagramPacket(message, message.length, java.net.InetAddress.getByName(this.networkGroup), this.networkPort));
}