public java.lang.String getIPAddress() throws com.mmotcp.exception.TCPRuntimeException {
    if ((((socket) == null) || (socket.isClosed())) || (!(socket.isConnected())))
        return null;
    
    return ((java.net.InetSocketAddress) (socket.getRemoteSocketAddress())).getAddress().toString().substring(1);
}