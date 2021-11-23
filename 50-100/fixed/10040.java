@org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.MONITOR, ignoreCancelled = true)
public void onEntityTame(org.bukkit.event.entity.EntityTameEvent event) {
    if (!((event.getOwner()) instanceof org.bukkit.entity.Player))
        return ;
    
    org.bukkit.entity.Player player = ((org.bukkit.entity.Player) (event.getOwner()));
    if (!(com.frdfsnlght.inquisitor.PlayerStats.isStatsPlayer(player)))
        return ;
    
    PlayerStats.group.getStatistics(player.getName()).incr("animalsTamed", com.frdfsnlght.inquisitor.Utils.normalizeEntityTypeName(event.getEntityType()));
}