public void registerCommands(me.G0ldenSp00n.plugin.EggSplosion plugin) {
    plugin.getCommand("spawns").setExecutor(new me.G0ldenSp00n.plugin.SpawnCmdHandler(plugin, spawnLogicFFA));
    plugin.getCommand("regenall").setExecutor(new me.G0ldenSp00n.plugin.RegenCmdHandler(regenHandler));
    plugin.getCommand("togglehoe").setExecutor(hoeHandler);
    plugin.getCommand("score").setExecutor(new me.G0ldenSp00n.plugin.ScoreboardCmdHandler(plugin, scoreboardLogicFFA, scoreboardLogicTDM));
    plugin.getCommand("game").setExecutor(new me.G0ldenSp00n.plugin.GameCmdHandler(game));
}