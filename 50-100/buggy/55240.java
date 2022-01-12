@org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.MONITOR)
public void onPlayerRespawn(org.bukkit.event.player.PlayerRespawnEvent event) {
    org.bukkit.entity.Player player = event.getPlayer();
    if (pearls.isImprisoned(player.getUniqueId()))
        return ;
    
    if ((event.getRespawnLocation().getWorld()) != (getPrisonWorld())) {
        portaled_players.remove(player.getUniqueId());
        mysqlStorage.removePortaledPlayer(player.getUniqueId());
        dirty = true;
    }
}