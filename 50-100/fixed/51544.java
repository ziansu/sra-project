@org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.MONITOR)
public void onLeave(co.neweden.gamesmanager.event.GMPlayerLeaveGameEvent event) {
    if ((event.isCancelled()) || (!(game.getPlayers().contains(event.getPlayer()))))
        return ;
    
    int playing = (game.getPlaying().size()) - 1;
    if (state.equals(co.neweden.gamesmanager.game.Lobby.LobbyState.INPROGRESS))
        if (playing < (minPlayersNeeded))
            pre();
        
    
}