@java.lang.Override
protected void clearConnection() {
    try {
        serverSocket.close();
        socket.close();
        serverSocket = null;
        socket = null;
        inputStream = null;
        outputStream = null;
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}