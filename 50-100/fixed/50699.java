public void onEnable() {
    try {
        logger = new cc.moecraft.hykilpikonna.essentials.logger.Logger("HyLimitFlow", true);
        logger.log("此插件正在加载......");
    } catch (java.lang.NoClassDefFoundError error) {
        cc.moecraft.limitflow.Bukkit.getConsoleSender().sendMessage(((((ChatColor.GOLD) + "") + (ChatColor.BOLD)) + "[HyFluidLimit]此插件需要HyEssentials前置!"));
    }
    getConfig().options().copyDefaults(true);
    checkConfig();
    saveConfig();
    cc.moecraft.limitflow.Bukkit.getPluginManager().registerEvents(this, this);
}