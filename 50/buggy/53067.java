@java.lang.Override
public void configParse(final org.bukkit.configuration.file.YamlConfiguration config) {
    if ((net.slipcor.pvparena.modules.scoreboards.ScoreBoards.sbm) == null) {
        net.slipcor.pvparena.modules.scoreboards.ScoreBoards.sbm = org.bukkit.Bukkit.getScoreboardManager();
    }
    org.bukkit.Bukkit.getPluginManager().registerEvents(new net.slipcor.pvparena.modules.scoreboards.PAListener(this), PVPArena.instance);
}