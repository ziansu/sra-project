public boolean connect() {
    try {
        this.socket = ((javax.net.ssl.SSLSocket) (javax.net.ssl.SSLSocketFactory.getDefault().createSocket(this.ip, this.port)));
        this.socket.setKeepAlive(true);
        this.EnableAnonCipherSuite();
        return true;
    } catch (java.net.SocketException e) {
        e.printStackTrace();
    } catch (java.io.IOException io) {
        java.lang.System.out.println(io.getMessage());
    }
    return false;
}