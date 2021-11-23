protected java.lang.Runnable newRunnable(java.net.Socket clientSocket) {
    this.sharedDate.addConsumer();
    return new Tp2.Ex06.Server.TimeWorker(clientSocket, this.sharedDate);
}