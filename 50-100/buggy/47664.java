@java.lang.Override
public void onEnable() {
    settingsManager.setup();
    initiateManagers();
    registerListeners();
    saveDefaultConfig();
    getCommand("shop").setExecutor(new pointshop.commands.ShopCmd(this));
    org.bukkit.command.ConsoleCommandSender console = getServer().getConsoleSender();
    console.sendMessage(((org.bukkit.ChatColor.GREEN) + "GUI Shop has been enabled"));
}