public static void startCleanupTask() {
    new org.bukkit.scheduler.BukkitRunnable() {
        public void run() {
            com.projectkorra.projectkorra.ability.combo.ComboManager.cleanupOldCombos();
        }
    }.runTaskTimer(ProjectKorra.plugin, 0, (((com.projectkorra.projectkorra.ability.combo.ComboManager.CLEANUP_DELAY) / 1000) * 20));
}