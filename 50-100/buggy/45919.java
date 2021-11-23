public com.sonycsl.echo.EchoFrame receive(java.net.Socket socket) throws java.io.IOException {
    java.io.DataInputStream in = new java.io.DataInputStream(socket.getInputStream());
    java.lang.String address = socket.getInetAddress().getHostAddress();
    com.sonycsl.echo.EchoFrame frame = null;
    try {
        frame = com.sonycsl.echo.EchoFrame.getEchoFrameFromStream(address, in);
        return frame;
    } catch (java.net.SocketTimeoutException e) {
        throw e;
    } catch (java.io.IOException e) {
        e.printStackTrace();
        closeTCPSocket(socket);
        throw e;
    }
}