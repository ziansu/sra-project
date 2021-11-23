public void onEnable() {
    cc.moecraft.hykilpikonna.lores.HyLores.loglogger.log("[加载]此插件正在加载......");
    getConfig().options().copyDefaults(true);
    saveConfig();
    cc.moecraft.hykilpikonna.lores.Setup.setup();
    cc.moecraft.hykilpikonna.lores.HyLores.instance = this;
    org.bukkit.Bukkit.getPluginManager().registerEvents(this, this);
    cc.moecraft.hykilpikonna.lores.HyLores.loglogger.log("[加载]此插件加载完成!");
}