private void go() {
    try {
        serverSocket = new java.net.ServerSocket(com.mersanuzun.examples.messanger.MessengerServer.PORT);
        java.lang.System.out.println("Server is running.");
        while (true) {
            java.net.Socket socket = serverSocket.accept();
            java.lang.System.out.println(socket.toString());
            clientsOutputStreams.add(new java.io.PrintWriter(socket.getOutputStream()));
            new java.lang.Thread(new com.mersanuzun.examples.messanger.MessengerServer.ClientHandler(socket)).start();
            java.lang.System.out.println("Got a connection.");
        } 
    } catch (java.io.IOException e) {
        e.printStackTrace();
    } finally {
    }
}