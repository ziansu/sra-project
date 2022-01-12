@java.lang.Override
public synchronized void stop() {
    if ((serverSocket) == null) {
        java.lang.System.err.println("Server already stopped");
        return ;
    }
    try {
        serverSocket.close();
        executorService.shutdown();
    } catch (java.io.IOException e) {
        java.lang.System.err.println(("Exception during closing ServerSocket: " + (e.getMessage())));
    }
    serverSocket = null;
}