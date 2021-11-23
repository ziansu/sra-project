private void loadLegacyFactions() {
    if (me.Qball.Wild.Utils.LoadDependencies.wild.getConfig().getBoolean("LegacyFactions")) {
        if ((org.bukkit.Bukkit.getServer().getPluginManager().getPlugin("LegacyFactions")) == null) {
            org.bukkit.Bukkit.getServer().getPluginManager().disablePlugin(me.Qball.Wild.Utils.LoadDependencies.wild);
            org.bukkit.Bukkit.getLogger().info("Plugin will disable due to missing dependency");
        }else {
            org.bukkit.Bukkit.getLogger().info("LegacyFactions hook enabled");
        }
    }
}