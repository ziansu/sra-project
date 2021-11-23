public void close() {
    try {
        socket.close();
        socket = null;
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}