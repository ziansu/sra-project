public boolean removeClient(de.dhbwka.java.bombercat.Client client, java.util.Map<java.lang.String, de.dhbwka.java.bombercat.Lobby> lobbies) {
    boolean result = false;
    if (lobbyLeader.equals(client)) {
        deleteLobby(lobbies);
        result = true;
    }else {
        result = clients.remove(client);
        client.setLobby(null);
        result = true;
    }
    if (result) {
        broadcastPlayers();
    }
    return result;
}