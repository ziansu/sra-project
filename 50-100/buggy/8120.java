private void acceptPhone() {
    java.net.ServerSocket serverSocket;
    try {
        serverSocket = new java.net.ServerSocket(10085);
        while (true) {
            java.net.Socket socket = serverSocket.accept();
            threads.PhoneServerThread thread = new threads.PhoneServerThread(socket);
            thread.start();
            java.lang.System.out.println(((("Get a Phone Socket ip:" + (socket.getInetAddress())) + "\tport:") + (socket.getPort())));
        } 
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}