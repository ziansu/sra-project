public static void main(java.lang.String[] args) {
    final java.lang.String SERVER_KEY = "server123";
    final int SERVER_PORT = 9001;
    try {
        java.net.ServerSocket serverSocket = new java.net.ServerSocket(SERVER_PORT);
        java.lang.System.out.println("Server Socket UP !");
        while (true) {
            java.net.Socket baseStationSocket = serverSocket.accept();
            new java.lang.Thread(new BaseStationController(baseStationSocket)).start();
        } 
    } catch (java.lang.Exception ex) {
        java.lang.System.err.println(ex.getMessage());
    }
}