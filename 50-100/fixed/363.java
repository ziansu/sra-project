public boolean onCommand(org.bukkit.command.CommandSender sender, org.bukkit.command.Command cmd, java.lang.String label, java.lang.String[] args) {
    if (cmd.getName().equalsIgnoreCase("minerhelmets")) {
        sender.sendMessage(((org.bukkit.ChatColor.GOLD) + "Miner Helmets"));
        sender.sendMessage(((org.bukkit.ChatColor.GOLD) + "Plugin Made by bennyman123abc"));
        sender.sendMessage(((org.bukkit.ChatColor.GREEN) + "Version: 1.1"));
        return true;
    }
    return false;
}