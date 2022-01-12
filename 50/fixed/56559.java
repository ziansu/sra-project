public void stop() throws java.io.IOException {
    this.isRunning.set(false);
    serverSocket.close();
    threadPool.shutdown();
}