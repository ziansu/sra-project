public void shutDown() {
    try {
        java.lang.Thread.sleep(1000);
    } catch (java.lang.InterruptedException e1) {
        e1.printStackTrace();
    }
    try {
        socket.close();
        socket = null;
    } catch (java.io.IOException e) {
    }
}