public void run() {
    while (true) {
        try {
            java.lang.System.out.println("Waiting for connection");
            java.nio.channels.SocketChannel socket = serverSocketChannel.accept();
            if (socket != null) {
                new org.dei.perla.server.Server.Handler(socket).start();
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    } 
}