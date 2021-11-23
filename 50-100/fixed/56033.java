@vg.civcraft.mc.namelayer.config.annotations.NameConfig(name = "groups.enable", def = "true", type = vg.civcraft.mc.namelayer.config.annotations.NameConfigType.Bool)
@java.lang.Override
public void onEnable() {
    vg.civcraft.mc.namelayer.NameLayerPlugin.instance = this;
    vg.civcraft.mc.namelayer.NameLayerPlugin.isMercuryEnabled = org.bukkit.Bukkit.getPluginManager().isPluginEnabled("Mercury");
    config = new vg.civcraft.mc.namelayer.config.NameConfigManager();
    registerListeners();
    loadDatabases();
    vg.civcraft.mc.namelayer.misc.ClassHandler.Initialize(org.bukkit.Bukkit.getServer());
    new vg.civcraft.mc.namelayer.NameAPI(new vg.civcraft.mc.namelayer.GroupManager(), vg.civcraft.mc.namelayer.NameLayerPlugin.associations, config);
    vg.civcraft.mc.namelayer.NameLayerPlugin.loadGroups = config.get(this, "groups.enable").getBool();
    if (vg.civcraft.mc.namelayer.NameLayerPlugin.loadGroups) {
        handle = new vg.civcraft.mc.namelayer.command.CommandHandler();
        handle.registerCommands();
    }
}