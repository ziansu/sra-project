public void sendMessage(org.bukkit.command.CommandSender p, java.lang.String msg, int id) {
    if (id != (-1)) {
        msg = translateDatabaseVariables(msg, id);
    }
    msg = org.bukkit.ChatColor.translateAlternateColorCodes('&', msg);
    p.sendMessage(msg.split("%n"));
}