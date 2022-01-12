public void addClientHandler(java.lang.String clientName, server.ClientHandler clientHandler) {
    clientMap.put(clientName, clientHandler);
    server.Log.write(Log.INFO, java.lang.String.format("Added client %s (with ClientHandler %s)", clientName, clientHandler));
    addMessage(new server.DataMessage(null, getClients()));
    if (undeliveredMessageMap.containsKey(clientName)) {
        for (server.Message m : undeliveredMessageMap.get(clientName)) {
            addMessage(m);
        }
    }
}