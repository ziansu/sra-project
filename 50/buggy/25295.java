public static void closeConnection() {
    try {
        GameServer.socket.close();
        GameServer.serverSocket.close();
        java.lang.System.out.println("Disconnected Server");
    } catch (java.io.IOException ex) {
        java.lang.System.out.println("Failed to close Server Socket.");
    }
}