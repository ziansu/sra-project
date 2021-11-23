@org.bukkit.event.EventHandler
public void onPlayerDamage(org.bukkit.event.entity.EntityDamageEvent e) {
    if (acpFood.isPluginEnabled) {
        org.bukkit.entity.Player p = ((org.bukkit.entity.Player) (e.getEntity()));
        if (((e.getEntity()) instanceof org.bukkit.entity.Player) && (FoodManager.appleEaters.contains(p))) {
            e.setCancelled(true);
        }
    }
}