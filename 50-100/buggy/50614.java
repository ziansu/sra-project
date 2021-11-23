@java.lang.Override
public void onLoad() {
    try {
        org.bukkit.Bukkit.getServer().getLogger().info("[PluginManager] Loading PluginManager v1.2.2 ...");
        org.bukkit.Bukkit.getServer().getLogger().info("[PluginManager] Loaded PluginManager v1.2.2");
    } catch (java.lang.Exception e) {
        org.bukkit.Bukkit.getServer().getLogger().info(("[PluginManager] Unknown error: " + e));
        e.printStackTrace();
    }
}