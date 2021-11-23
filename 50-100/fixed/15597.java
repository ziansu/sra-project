@ml.svterraflops.plugins.mcballpaint.game.EventHandler(priority = EventPriority.HIGHEST)
public void onPlayerQuit(ml.svterraflops.plugins.mcballpaint.game.PlayerQuitEvent event) {
    getStatProvider().flush(event.getPlayer().getUniqueId());
    if ((currentGame()) != null)
        currentGame().removePlayer(event.getPlayer());
    
    getLobby().removePlayer(event.getPlayer());
    players.remove(event.getPlayer());
    for (ml.svterraflops.plugins.mcballpaint.game.IArenaConstructor c : new java.util.ArrayList<ml.svterraflops.plugins.mcballpaint.game.IArenaConstructor>(constructors))
        c.removePlayer(event.getPlayer());
    
}