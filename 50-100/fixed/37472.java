@java.lang.Override
public void run() {
    try {
        p.teleport(org.bukkit.Bukkit.getWorld("yomi").getSpawnLocation());
        new org.bukkit.scheduler.BukkitRunnable() {
            @java.lang.Override
            public void run() {
                try {
                    addItem(p);
                } catch (java.lang.Exception ignored) {
                }
            }
        }.runTaskLater(cc.isotopestudio.born.Born.plugin, 2);
    } catch (java.lang.Exception ignored) {
    }
}