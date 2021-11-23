@java.lang.Override
public void onEnable() {
    final java.io.File configFile = new java.io.File(this.getDataFolder(), "config.yml");
    if (!(configFile.exists()))
        this.saveDefaultConfig();
    
    this.reloadConfig();
    this.settings = new io.github.kyzderp.horseinfotags.Settings(this);
    this.settings.loadSettings();
    this.playerListener = new io.github.kyzderp.horseinfotags.PlayerListener(this, this.settings);
    this.getServer().getPluginManager().registerEvents(this.playerListener, this);
}