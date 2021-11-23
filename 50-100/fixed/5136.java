public void send(java.lang.String channel, java.lang.String jsonString) {
    for (org.exist.remoteconsole.RemoteConsoleServlet.RemoteConsoleSocket socket : sockets) {
        try {
            socket.sendMessage(channel, jsonString);
        } catch (java.io.IOException e) {
            org.exist.remoteconsole.RemoteConsoleServlet.LOG.error(("Error sending message via websocket: " + (e.getMessage())), e);
        }
    }
}