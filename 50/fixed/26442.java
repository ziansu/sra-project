public synchronized void StopToken() {
    try {
        wait();
        java.lang.Thread.sleep(1);
    } catch (java.lang.Exception e) {
        java.lang.System.out.println("Error while token thread was locking...");
        SendRemovePlayerMessage();
    }
}