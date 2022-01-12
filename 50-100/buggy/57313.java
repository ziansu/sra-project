@org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.HIGHEST)
public void onFoodLevelChange(org.bukkit.event.entity.FoodLevelChangeEvent event) {
    if ((event.isCancelled()) || (!((event.getEntity()) instanceof org.bukkit.entity.Player)))
        return ;
    
    for (de.beimax.simplespleef.game.Game game : games) {
        game.onFoodLevelChange(event);
    }
}