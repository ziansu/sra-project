public synchronized java.net.Socket accept() throws java.io.IOException {
    if (((serverSocket) == null) || (serverSocket.isClosed())) {
        return null;
    }
    return serverSocket.accept();
}