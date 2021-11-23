public void runServer(int port) {
    try {
        java.net.ServerSocket serverSocket = new java.net.ServerSocket(port);
        while (true) {
            java.net.Socket socket = serverSocket.accept();
            ServerThread serverThread = new ServerThread(socket);
            serverThread.setDaemon(true);
            serverThread.start();
        } 
    } catch (java.io.IOException e) {
        e.printStackTrace();
        java.lang.System.exit(1);
    }
}