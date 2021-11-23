public static void extinguish(final org.bukkit.entity.Player player) {
    new org.bukkit.scheduler.BukkitRunnable() {
        @java.lang.Override
        public void run() {
            player.setFireTicks(0);
        }
    }.runTaskLater(me.realized.duels.Core.getInstance(), 1L);
}