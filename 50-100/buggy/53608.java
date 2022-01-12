@org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.HIGHEST)
public void onEntityDeath(org.bukkit.event.entity.EntityDeathEvent event) {
    if (!((event.getEntity()) instanceof org.bukkit.entity.Player))
        return ;
    
    for (de.beimax.simplespleef.game.Game game : games) {
        game.onPlayerDeath(((org.bukkit.entity.Player) (event.getEntity())));
    }
}