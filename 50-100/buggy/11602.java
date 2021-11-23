@java.lang.Override
public void run() {
    while ((hitQueue.size()) > 0) {
        org.bukkit.event.entity.EntityDamageByEntityEvent e = hitQueue.remove();
        org.bukkit.Bukkit.getPluginManager().callEvent(e);
        if (!(e.isCancelled()))
            ((org.bukkit.entity.Damageable) (e.getEntity())).damage(e.getDamage(), e.getDamager());
        
    } 
}