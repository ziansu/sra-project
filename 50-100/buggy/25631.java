@org.bukkit.event.EventHandler(ignoreCancelled = true, priority = org.bukkit.event.EventPriority.LOW)
public void PlayerDamageDeal(final org.bukkit.event.entity.EntityDamageByEntityEvent event) {
    if (!((event.getDamager()) instanceof org.bukkit.entity.Player))
        return ;
    
    final org.bukkit.entity.Player player = ((org.bukkit.entity.Player) (event.getDamager()));
    if (plugin.isLoggedInPlus(player))
        return ;
    
    event.setCancelled(true);
}