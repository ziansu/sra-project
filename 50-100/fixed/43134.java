@java.lang.Override
public void onEnable() {
    se.fredsfursten.telepadplugin.TelePadPlugin.telePadStorageFile = new java.io.File(getDataFolder(), "telepads.json");
    getServer().getPluginManager().registerEvents(this, this);
    se.fredsfursten.telepadplugin.Teleer.get().enable(this);
    se.fredsfursten.telepadplugin.Commands.get().enable(this);
}