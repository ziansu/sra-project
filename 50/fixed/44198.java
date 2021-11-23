public void broadcast(java.lang.String message) {
    java.lang.String msg = "server:";
    for (server.GameServer.ConnectionThread connection : connections) {
        connection.sendMessage(msg.concat(message));
    }
}