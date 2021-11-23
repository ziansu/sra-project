@java.lang.Override
public void onEnable() {
    this.manager = new com.sainttx.holograms.HologramManager(this);
    if (setupController()) {
        manager.load();
        getCommand("holograms").setExecutor(new com.sainttx.holograms.commands.HologramCommands(this));
        getServer().getPluginManager().registerEvents(new com.sainttx.holograms.HologramListener(manager), this);
    }
}