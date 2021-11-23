public void onEnable() {
    org.bukkit.command.ConsoleCommandSender console = org.bukkit.Bukkit.getServer().getConsoleSender();
    console.sendMessage(((org.bukkit.ChatColor.GREEN) + "Het AntiCurse systeem wordt geladen!"));
    getConfig().options().copyDefaults(true);
    saveConfig();
    getServer().getPluginManager().registerEvents(this, this);
    console.sendMessage(((org.bukkit.ChatColor.AQUA) + "Het AntiCurse systeem is succesvol geladen!"));
}