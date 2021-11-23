@java.lang.Override
public void onEnable() {
    this.saveDefaultConfig();
    this.getConfig();
    setupItems();
    this.getServer().getPluginManager().registerEvents(new com.dyllanplugins.listener.Repair(itemList), this);
    getCommand("easyrepair").setExecutor(new com.dyllanplugins.command.Commands(this, itemList));
}