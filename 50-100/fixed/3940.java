public static void main(java.lang.String[] args) {
    try {
        java.net.ServerSocket welcomeSocket = new java.net.ServerSocket(12000);
        while (true) {
            java.net.Socket connectionSocket = welcomeSocket.accept();
            java.lang.System.out.println(((connectionSocket.getInetAddress().toString().substring(1)) + " connected"));
            ServerThread serverThread = new ServerThread(connectionSocket);
            serverThread.start();
        } 
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}