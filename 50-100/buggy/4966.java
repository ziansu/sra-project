protected java.net.Socket createConnectSocket(java.net.URI remote, int timeout) throws org.eclipse.ecf.core.util.ECFException {
    org.eclipse.ecf.provider.comm.tcp.SocketFactory fact = org.eclipse.ecf.provider.comm.tcp.SocketFactory.getSocketFactory();
    if (fact == null)
        fact = org.eclipse.ecf.provider.comm.tcp.SocketFactory.getDefaultSocketFactory();
    
    try {
        return fact.createSocket(remote.getHost(), remote.getPort(), timeout);
    } catch (java.io.IOException e) {
        throw new org.eclipse.ecf.core.util.ECFException(("Could not create socket to connect to id=" + remote));
    }
}