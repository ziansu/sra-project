public static void main(java.lang.String[] args) {
    java.lang.Thread serverThread = new java.lang.Thread(new server.ConnectionEstablishAnycastServer());
    java.lang.Thread clientThread = new java.lang.Thread(new client.MulticastClient());
    serverThread.start();
    clientThread.start();
    try {
        serverThread.join();
        clientThread.join();
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}