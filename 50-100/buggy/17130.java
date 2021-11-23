@org.bukkit.event.EventHandler
public void onEntityDamageEvent(org.bukkit.event.entity.EntityDamageEvent event) {
    if ((event.getEntity()) instanceof org.bukkit.entity.Player) {
        if (isOnControl(((org.bukkit.entity.Player) (event.getEntity())))) {
            event.setCancelled(getConfigBoolean("Event.God"));
        }
    }
}