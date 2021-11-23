public void disconnect() {
    try {
        java.lang.System.out.println("disconnect now");
        if ((socket) != null) {
            socket.close();
        }
        requestThread.interrupt();
        taskQueue.clear();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}