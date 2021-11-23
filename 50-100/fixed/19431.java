public static void main(java.lang.String[] args) {
    java.lang.Thread serverThread = new java.lang.Thread(new server.ConnectionEstablishAnycastServer());
    serverThread.start();
    try {
        serverThread.join();
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}