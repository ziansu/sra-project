@org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.LOWEST, ignoreCancelled = true)
public void onEntityCombust(org.bukkit.event.entity.EntityCombustEvent event) {
    if (stopSunlightCombustion) {
        org.bukkit.entity.EntityType type = event.getEntityType();
        if ((type == (org.bukkit.entity.EntityType.SKELETON)) || (type == (org.bukkit.entity.EntityType.ZOMBIE))) {
            org.bukkit.World world = event.getEntity().getWorld();
            if ((world.getTime()) <= 13500L) {
                event.setCancelled(true);
            }
        }
    }
}