@java.lang.Override
public boolean onFoodLevelChange(org.bukkit.event.entity.FoodLevelChangeEvent event) {
    if (!(isEnabled()))
        return false;
    
    org.bukkit.entity.Player player = ((org.bukkit.entity.Player) (event.getEntity()));
    if ((hasPlayer(player)) && (configuration.getBoolean("noHunger", true))) {
        event.setCancelled(true);
        return true;
    }
    return false;
}