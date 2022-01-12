@org.bukkit.event.EventHandler
public void onMythicPlayerJoin(org.bukkit.event.player.PlayerJoinEvent e) {
    if (e.getPlayer().hasMetadata("MythicPlayer"))
        this.attachActivePlayer(e.getPlayer(), true);
    
}