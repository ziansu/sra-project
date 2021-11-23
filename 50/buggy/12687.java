private void sendAll(java.lang.String message) {
    for (chat.Connection connection : chat.Server.connectedClients.values()) {
        try {
            connection.send(message);
        } catch (java.io.IOException e) {
            java.lang.System.out.println("Сообщение не было разослано");
        }
    }
}