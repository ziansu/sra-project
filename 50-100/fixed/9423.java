public boolean open(int localport) {
    try {
        socket = new java.net.Socket();
        socket.setSoLinger(true, 0);
        socket.bind(new java.net.InetSocketAddress(localport));
    } catch (java.lang.Exception e) {
        javaforce.voip.JFLog.log(e);
        return false;
    }
    return true;
}