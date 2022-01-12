@org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.HIGH, ignoreCancelled = true)
public void onFireworkDamage(org.bukkit.event.entity.EntityDamageByEntityEvent event) {
    if (((event.getDamager()) instanceof org.bukkit.entity.Firework) && ((event.getEntity()) instanceof org.bukkit.entity.Player)) {
        org.bukkit.entity.Firework fw = ((org.bukkit.entity.Firework) (event.getDamager()));
        if (fireWorks.contains(fw)) {
            event.setCancelled(true);
        }
    }
}