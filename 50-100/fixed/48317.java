public void connect() throws java.io.IOException {
    try {
        socket = new java.net.Socket(ipAddress, serverPort);
        in = new java.io.DataInputStream(socket.getInputStream());
        out = new java.io.DataOutputStream(socket.getOutputStream());
    } catch (java.lang.Exception ex) {
        throw ex;
    }
}