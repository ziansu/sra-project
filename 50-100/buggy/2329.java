@org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.MONITOR, ignoreCancelled = true)
public void onBlockIgnite(org.bukkit.event.block.BlockIgniteEvent event) {
    org.bukkit.entity.Player player = event.getPlayer();
    if (!(com.frdfsnlght.inquisitor.PlayerStats.isStatsPlayer(player)))
        return ;
    
    if ((event.getPlayer()) == null)
        return ;
    
    PlayerStats.group.getStatistics(player.getName()).incr("firesStarted");
}