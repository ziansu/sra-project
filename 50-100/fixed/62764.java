public void run() {
    client.ServerListener serverListener = new client.ServerListener(socket);
    serverListener.start();
    try {
        java.io.PrintWriter out = new java.io.PrintWriter(socket.getOutputStream(), true);
        while (running) {
            if ((client.Client.input) != null)
                out.println(client.Client.input);
            
        } 
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}