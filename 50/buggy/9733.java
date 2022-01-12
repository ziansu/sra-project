public void start() {
    checkingThread.start();
    nodeManagerReadThread.start();
    if (isMaster) {
        resourceManagerReadThread.start();
    }
}