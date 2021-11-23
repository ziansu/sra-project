@java.lang.Override
public synchronized void stop() {
    if ((serverSocket) == null) {
        java.lang.System.err.println("Server already stopped");
        return ;
    }
    try {
        executorService.shutdown();
        serverSocket.close();
    } catch (java.io.IOException e) {
    }
    serverSocket = null;
}