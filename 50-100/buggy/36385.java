public void sendMessage(org.bukkit.command.CommandSender p, java.lang.String msg, int id) {
    msg = org.bukkit.ChatColor.translateAlternateColorCodes('&', msg);
    if (id != (-1)) {
        p.sendMessage(translateDatabaseVariables(msg, id).split("%n"));
    }else {
        p.sendMessage(msg.split("%n"));
    }
}