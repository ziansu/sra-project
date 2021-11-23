public void onEnable() {
    org.bukkit.Bukkit.getPluginManager().registerEvents(((org.bukkit.event.Listener) (this)), ((org.bukkit.plugin.Plugin) (this)));
    me.Qball.Wild.Wild.plugin = this;
    logger.info("Wilderness by Qball was successfully enabled on server!");
    this.getConfig().options().copyDefaults(true);
    this.saveConfig();
    cooldownTime = new java.util.HashMap<java.util.UUID, java.lang.Long>();
}