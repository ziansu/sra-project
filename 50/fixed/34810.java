@org.jetbrains.annotations.Nullable
private Lobby getLobbyById(int id) {
    for (Lobby lobby : LobbyManager.lobbyList) {
        if ((lobby.getId()) == id) {
            return lobby;
        }
    }
    return null;
}