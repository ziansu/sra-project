protected void update() {
    try {
        java.net.Socket connection = socket.accept();
        addConnection(new guichaguri.minimalftp.FTPConnection(this, connection));
    } catch (java.io.IOException ex) {
    }
}