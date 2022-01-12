public void shutDown() {
    try {
        java.lang.Thread.sleep(1000);
    } catch (java.lang.InterruptedException e1) {
        e1.printStackTrace();
    }
    model.shutDown();
    try {
        socket.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}