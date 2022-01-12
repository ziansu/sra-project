@java.lang.Override
public void onEnable() {
    if (!(se.fredsfursten.plugintools.PluginConfig.isEnabled()))
        se.fredsfursten.plugintools.PluginConfig.enable(this, "config.yml");
    
    se.fredsfursten.telepadplugin.TelePadPlugin.telePadStorageFile = new java.io.File(getDataFolder(), "telepads.json");
    getServer().getPluginManager().registerEvents(this, this);
    se.fredsfursten.telepadplugin.Teleer.get().enable(this);
    se.fredsfursten.telepadplugin.Commands.get().enable(this);
}