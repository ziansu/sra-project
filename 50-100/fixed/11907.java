public void launch() {
    try {
        socket = new java.net.ServerSocket(port);
        java.lang.System.out.println((("TCP high level server is running on " + (port)) + "..."));
        while (true) {
            java.net.Socket tcpClient = socket.accept();
            client.Client client = new client.Client(tcpClient, responseDelay, this);
            executorService.submit(client);
            java.lang.System.out.println("Server is listening new client...");
        } 
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}