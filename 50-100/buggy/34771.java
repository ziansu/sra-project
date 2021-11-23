public java.lang.String getIPAddress() throws com.mmotcp.exception.TCPRuntimeException {
    if ((socket) == null)
        throw new com.mmotcp.exception.TCPRuntimeException("Socket was not initialized.");
    
    if (socket.isClosed())
        throw new com.mmotcp.exception.TCPRuntimeException("Socket is closed.");
    
    if (!(socket.isConnected()))
        throw new com.mmotcp.exception.TCPRuntimeException("Socket is not connected.");
    
    return ((java.net.InetSocketAddress) (socket.getRemoteSocketAddress())).getAddress().toString().substring(1);
}