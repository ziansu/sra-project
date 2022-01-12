@java.lang.Override
public void run() {
    try {
        java.net.ServerSocket serverSocket = new java.net.ServerSocket(Server.PORT);
        boolean running = true;
        while (running) {
            java.net.Socket socket = serverSocket.accept();
            _queue.offer(new Server.ObjectSocket(socket));
            java.lang.System.out.println(((("Client #" + (++(clientNumber))) + " connected to ") + (socket.getLocalSocketAddress())));
            toFile();
        } 
    } catch (java.io.IOException ex) {
        ex.printStackTrace();
    }
}