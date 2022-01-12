public boolean connect(java.lang.String host, int port) {
    try {
        java.net.Socket socket = new java.net.Socket(host, port);
        hostStruct = new com.blastedstudios.entente.HostStruct(socket);
        java.util.logging.Logger.getLogger(this.getClass().getName()).fine(("Connected to server: " + (socket.toString())));
    } catch (java.net.UnknownHostException e) {
        e.printStackTrace();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return isConnected();
}