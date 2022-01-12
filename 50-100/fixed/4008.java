@java.lang.Override
public void onEnable() {
    this.manager = new com.sainttx.holograms.HologramManager(this);
    if (setupController()) {
        getServer().getPluginManager().registerEvents(new com.sainttx.holograms.HologramListener(this), this);
        manager.load();
        getCommand("holograms").setExecutor(new com.sainttx.holograms.commands.HologramCommands(this));
    }
}