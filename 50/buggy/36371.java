public void stop() {
    connectionSocket.close();
    java.lang.Thread.currentThread().interrupt();
    return ;
}