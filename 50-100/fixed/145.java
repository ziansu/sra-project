public static void setProtocolsAndCiphers(javax.net.ssl.SSLServerSocket socket) {
    java.lang.String[] p = net.i2p.util.I2PSSLSocketFactory.selectProtocols(socket.getEnabledProtocols(), socket.getSupportedProtocols());
    for (int i = 0; i < (p.length); i++) {
        if (p[i].equals("SSLv3"))
            return ;
        
    }
    socket.setEnabledProtocols(p);
    socket.setEnabledCipherSuites(net.i2p.util.I2PSSLSocketFactory.selectCipherSuites(socket.getEnabledCipherSuites(), socket.getSupportedCipherSuites()));
}