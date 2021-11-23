@org.bukkit.event.EventHandler
public void stopBoatDamage(org.bukkit.event.entity.EntityExplodeEvent event) {
    be.isach.ultracosmetics.cosmetics.mounts.Entity e = event.getEntity();
    if (e == (entity))
        event.setCancelled(true);
    
}