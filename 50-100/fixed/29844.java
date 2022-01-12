@java.lang.Override
public void onEnable() {
    initiateManagers();
    registerListeners();
    saveDefaultConfig();
    getCommand("shop").setExecutor(new pointshop.commands.ShopCmd());
    org.bukkit.command.ConsoleCommandSender console = getServer().getConsoleSender();
    console.sendMessage(((org.bukkit.ChatColor.RED) + "GUI Shop has been enabled"));
}