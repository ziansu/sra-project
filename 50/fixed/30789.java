public void close() {
    try {
        socket.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}