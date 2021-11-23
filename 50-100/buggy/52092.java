@java.lang.Override
public void onFoodLevelChange(org.bukkit.event.entity.FoodLevelChangeEvent event) {
    if (!(isEnabled()))
        return ;
    
    org.bukkit.entity.Player player = ((org.bukkit.entity.Player) (event.getEntity()));
    if ((hasPlayer(player)) && (configuration.getBoolean("noHunger", true)))
        event.setCancelled(true);
    
}