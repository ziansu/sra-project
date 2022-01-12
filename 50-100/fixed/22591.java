public void onEnable() {
    org.bukkit.plugin.PluginManager pm = this.getServer().getPluginManager();
    pm.registerEvents(new de.teamfci.fcishop.PluginEnableListener(), this);
    pm.registerEvents(new de.teamfci.fcishop.entity.Haendler(), this);
    de.teamfci.fcishop.commands.FCISCommand cFCISCommand = new de.teamfci.fcishop.commands.FCISCommand();
    this.getCommand("fcis").setExecutor(cFCISCommand);
    this.getCommand("fortresscombat1shop").setExecutor(cFCISCommand);
}