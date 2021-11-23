public boolean onCommand(org.bukkit.command.CommandSender sender, org.bukkit.command.Command command, java.lang.String label, java.lang.String[] args) {
    if ((args.length) < 1) {
        return false;
    }
    java.lang.String message = com.superiornetworks.icarus.ICM_Utils.buildMessage(args, 0);
    org.bukkit.Bukkit.broadcastMessage((((((org.bukkit.ChatColor.LIGHT_PURPLE) + "[Server:") + (sender.getName())) + "] ") + (org.bukkit.ChatColor.stripColor(message))));
    return true;
}