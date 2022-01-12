@org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.HIGHEST)
public void onRespawn(cc.isotopestudio.born.PlayerRespawnEvent e) {
    org.bukkit.entity.Player p = e.getPlayer();
    new org.bukkit.scheduler.BukkitRunnable() {
        @java.lang.Override
        public void run() {
            try {
                p.teleport(org.bukkit.Bukkit.getWorld("yomi").getSpawnLocation());
                addItem(p);
            } catch (java.lang.Exception ignored) {
            }
        }
    }.runTaskLater(cc.isotopestudio.born.Born.plugin, 2);
}