public void broadcast(java.lang.String message) {
    java.lang.String msg = "server:";
    textArea.append("event");
    for (server.GameServer.ConnectionThread connection : connections) {
        connection.sendMessage(msg.concat(message));
    }
}