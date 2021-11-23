public java.net.DatagramPacket makeDatagramPacket(java.net.InetAddress address, int port) throws java.io.IOException {
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    java.io.ObjectOutput out = new java.io.ObjectOutputStream(bos);
    out.writeObject(this);
    byte[] buf = java.util.Arrays.copyOf(bos.toByteArray(), bos.toByteArray().length);
    out.close();
    return new java.net.DatagramPacket(buf, buf.length, java.net.InetAddress.getByName(Client.INETADDRESS), client.Client.PORT);
}