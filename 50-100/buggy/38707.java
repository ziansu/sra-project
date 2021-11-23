private void initializeLobbies() {
    me.stuntguy3000.java.telegames.object.config.LobbyList lobbyList = getInstance().getConfigHandler().getLobbyList();
    for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.Integer>> lobby : lobbyList.getActiveLobbies().entrySet()) {
        getInstance().getLobbyHandler().createLobby(lobby.getKey(), lobby.getValue());
    }
}