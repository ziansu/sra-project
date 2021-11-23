void enable(org.bukkit.plugin.java.JavaPlugin plugin) {
    this.plugin = plugin;
    double seconds = se.fredsfursten.plugintools.PluginConfig.get().getDouble("SecondsBeforeLoad", 5.0);
    this.allTelePads.delayedLoad(plugin, seconds);
}