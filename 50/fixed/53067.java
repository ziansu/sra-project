@java.lang.Override
public void configParse(final org.bukkit.configuration.file.YamlConfiguration config) {
    org.bukkit.Bukkit.getPluginManager().registerEvents(new net.slipcor.pvparena.modules.scoreboards.PAListener(this), PVPArena.instance);
}