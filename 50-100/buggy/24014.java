@java.lang.Override
public void onEnable() {
    vg.civcraft.mc.bettershards.BetterShardsPlugin.plugin = this;
    vg.civcraft.mc.bettershards.BetterShardsPlugin.config = GetConfig();
    vg.civcraft.mc.bettershards.BetterShardsPlugin.servName = vg.civcraft.mc.mercury.config.MercuryConfigManager.getServerName();
    db = new vg.civcraft.mc.bettershards.database.DatabaseManager();
    pm = new vg.civcraft.mc.bettershards.PortalsManager();
    pm.loadPortalsManager();
    registerListeners();
    registerMercuryChannels();
}