public com.sk89q.worldguard.bukkit.WorldGuardPlugin getWorldGuard() {
    final org.bukkit.plugin.Plugin plugin = org.bukkit.Bukkit.getServer().getPluginManager().getPlugin("WorldGuard");
    if (!(plugin instanceof com.sk89q.worldguard.bukkit.WorldGuardPlugin)) {
        return null;
    }
    return ((com.sk89q.worldguard.bukkit.WorldGuardPlugin) (plugin));
}