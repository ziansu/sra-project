@java.lang.Override
protected void clearConnection() {
    try {
        if ((serverSocket) != null) {
            serverSocket.close();
        }
        if ((socket) != null) {
            socket.close();
        }
        serverSocket = null;
        socket = null;
        inputStream = null;
        outputStream = null;
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}