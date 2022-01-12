@java.lang.Override
public void run() {
    resetBeacons();
    handlePlayerLeave();
    for (org.bukkit.entity.Player p : players)
        p.teleport(ml.lasertag.minigame.GameManager.Bukkit.getWorld("Lobby").getSpawnLocation());
    
    emptyArena();
    arenaState = ml.lasertag.minigame.GameManager.Arena.ArenaState.WAITING;
    canJoin = true;
    scoreboard.reset();
    ml.lasertag.minigame.GameManager.Bukkit.getPluginManager().callEvent(new ml.lasertag.minigame.events.ArenaInteractEvent(ArenaInteractEvent.ArenaAction.UPDATE_STAT, arena));
}