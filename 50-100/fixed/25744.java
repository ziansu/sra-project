private void runServer() {
    while (!(interrupt)) {
        if ((serverSocket) == null)
            return ;
        
        try {
            java.net.Socket clientSocket = serverSocket.accept();
            new java.lang.Thread(() -> processSocket(clientSocket)).start();
        } catch (java.lang.Exception e) {
            com.awaker.util.Log.error(e);
        }
    } 
}