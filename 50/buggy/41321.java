@org.bukkit.event.EventHandler
public void onEntityDamage(org.bukkit.event.entity.EntityDamageByEntityEvent event) {
    be.isach.ultracosmetics.cosmetics.mounts.Entity e = event.getDamager();
    if (e == (entity)) {
        event.setCancelled(true);
    }
}