public void close() {
    try {
        isRunning = false;
        client.close();
        select.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}