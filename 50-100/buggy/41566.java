public void onEnable() {
    org.bukkit.command.ConsoleCommandSender console = org.bukkit.Bukkit.getServer().getConsoleSender();
    console.sendMessage(((org.bukkit.ChatColor.GREEN) + "Het AntiCurse systeem wordt geladen!"));
    getConfig().options().copyDefaults(true);
    saveConfig();
    org.bukkit.Bukkit.getServer().getPluginManager().registerEvents(new nl.gewoonhdgaming.anticurse.events.PlayerChatEvent(), this);
    console.sendMessage(((org.bukkit.ChatColor.AQUA) + "Het AntiCurse systeem is succesvol geladen!"));
}