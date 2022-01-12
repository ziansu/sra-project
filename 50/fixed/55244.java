public void createNewGameRoom(java.lang.String pGameName, int pNumRequestedClients) {
    aGameRooms.put(pGameName, new mw.server.network.lobby.GameRoom(pNumRequestedClients));
}