private java.net.Socket enableTLSOnSocket(java.net.Socket socket) {
    if (socket instanceof javax.net.ssl.SSLSocket) {
        if ((android.os.Build.VERSION.SDK_INT) >= (android.os.Build.VERSION_CODES.JELLY_BEAN)) {
            ((javax.net.ssl.SSLSocket) (socket)).setEnabledProtocols(new java.lang.String[]{ "TLSv1.1" , "TLSv1.2" });
        }else {
            ((javax.net.ssl.SSLSocket) (socket)).setEnabledProtocols(new java.lang.String[]{ "TLSv1" });
        }
    }
    return socket;
}