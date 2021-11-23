public static void teleportPlayer(org.bukkit.entity.Player player, org.bukkit.Location location, org.bukkit.plugin.java.JavaPlugin plugin) {
    int backupTask;
    player.teleport(location);
    backupTask = plugin.getServer().getScheduler().scheduleAsyncDelayedTask(plugin, new net.madmanmarkau.MultiHome.ChunkResendTask(location), 1);
    if (backupTask == (-1)) {
        net.madmanmarkau.MultiHome.Messaging.logSevere("Failed to create chunk resend schedule!", plugin);
    }
}