private void close() {
    try {
        if (((serverSocket) != null) && (!(serverSocket.isClosed()))) {
            listeningThread.suspend();
            listeningThread.stop();
            serverSocket.close();
        }
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}