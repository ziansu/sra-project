public void joinLobby(org.bukkit.entity.Player player, com.github.jannled.mdiServer.lobby.Lobby lobby) {
    if ((lobbys.size()) < 1)
        return ;
    
    for (com.github.jannled.mdiServer.lobby.Lobby l : lobbys) {
        l.leaveLobby(player);
    }
    lobby.joinLobby(player);
}