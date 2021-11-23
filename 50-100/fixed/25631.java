@org.bukkit.event.EventHandler(ignoreCancelled = true, priority = org.bukkit.event.EventPriority.LOW)
public void PlayerDamageDeal(final org.bukkit.event.entity.EntityDamageByEntityEvent event) {
    final org.bukkit.entity.Player player = getDamager(event.getDamager());
    if (player == null) {
        return ;
    }
    if (plugin.isLoggedInPlus(player))
        return ;
    
    event.setCancelled(true);
}