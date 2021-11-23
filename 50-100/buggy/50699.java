public void onEnable() {
    try {
        logger.log("此插件正在加载......");
    } catch (java.lang.NoClassDefFoundError error) {
        cc.moecraft.limitflow.Bukkit.getConsoleSender().sendMessage(((((ChatColor.GOLD) + "") + (ChatColor.BOLD)) + "[HyFluidLimit]此插件需要HyEssentials前置!"));
    }
    logger = new cc.moecraft.hykilpikonna.essentials.logger.Logger("HyLimitFlow", true);
    getConfig().options().copyDefaults(true);
    checkConfig();
    saveConfig();
    cc.moecraft.limitflow.Bukkit.getPluginManager().registerEvents(this, this);
}