private void acceptPhone() {
    java.net.ServerSocket serverSocket;
    try {
        serverSocket = new java.net.ServerSocket(10085);
        while (true) {
            java.net.Socket socket = serverSocket.accept();
            threads.PhoneServerThread thread = new threads.PhoneServerThread(socket);
            thread.start();
        } 
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}