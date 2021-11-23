public void onEnable() {
    super.onEnable();
    getLogger().info("Has debug: ");
    if (!(getConfig().getBoolean("dont-load-example", false))) {
        saveDefaultConfig();
        getConfig().options().copyDefaults(true);
        saveConfig();
        reloadConfig();
    }
    getServer().getPluginManager().registerEvents(this, this);
    this.getCommand("gui").setExecutor(this);
}