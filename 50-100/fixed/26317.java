public void addChannel(org.dei.perla.channel.tcp.TcpChannel channel) {
    int port = channel.getPort();
    java.lang.String ipAddress = channel.getIpAddress();
    java.net.InetSocketAddress isAddr = null;
    try {
        isAddr = new java.net.InetSocketAddress(java.net.InetAddress.getByName(ipAddress), port);
        java.lang.System.out.println(isAddr);
    } catch (java.net.UnknownHostException e) {
        e.printStackTrace();
    }
    if (isAddr != null)
        demux.addChannel(isAddr, channel);
    else {
        java.lang.System.out.println("Error");
    }
}