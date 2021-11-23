@java.lang.Override
public void onEnable() {
    this.getConfig();
    this.saveDefaultConfig();
    setupItems();
    this.getServer().getPluginManager().registerEvents(new com.dyllanplugins.listener.Repair(itemList), this);
    getCommand("easyrepair").setExecutor(new com.dyllanplugins.command.Commands(this, itemList));
}