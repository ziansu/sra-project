public void onEnable() {
    cc.moecraft.hykilpikonna.lores.HyLores.loglogger.log("[加载]此插件正在加载......");
    cc.moecraft.hykilpikonna.lores.HyLores.instance = this;
    getConfig().options().copyDefaults(true);
    saveConfig();
    cc.moecraft.hykilpikonna.lores.Setup.setup();
    org.bukkit.Bukkit.getPluginManager().registerEvents(this, this);
    cc.moecraft.hykilpikonna.lores.HyLores.loglogger.log("[加载]此插件加载完成!");
}