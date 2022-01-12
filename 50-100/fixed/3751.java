@java.lang.Override
public void onEnable() {
    if ((se.fredsfursten.eithonfixesplugin.EithonFixesPlugin.configuration) == null) {
        se.fredsfursten.eithonfixesplugin.EithonFixesPlugin.configuration = new se.fredsfursten.plugintools.PluginConfig(this, "config.yml");
    }else {
        se.fredsfursten.eithonfixesplugin.EithonFixesPlugin.configuration.load();
    }
    se.fredsfursten.plugintools.ConfigurableFormat.enable(se.fredsfursten.eithonfixesplugin.EithonFixesPlugin.getPluginConfig());
    se.fredsfursten.eithonfixesplugin.EithonFixesPlugin.EithonFixestorageFile = new java.io.File(getDataFolder(), "EithonFixes.bin");
    getServer().getPluginManager().registerEvents(this, this);
    se.fredsfursten.eithonfixesplugin.Fixes.get().enable(this);
    se.fredsfursten.eithonfixesplugin.Commands.get().enable(this);
}