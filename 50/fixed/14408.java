public void sendMessage(java.lang.String message) {
    java.lang.System.out.println(message);
    for (server.ClientConnection client : clients) {
        client.sendMessage(message);
    }
}