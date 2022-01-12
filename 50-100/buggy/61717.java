protected void sendMessage(org.bukkit.command.CommandSender sender, java.lang.String message, java.lang.String prefix) {
    if (sender instanceof org.bukkit.entity.Player) {
        message = parseColors(message);
        prefix = parseColors(prefix);
        messagePrinter(((org.bukkit.entity.Player) (sender)), message, prefix);
    }else {
        message = stripColors(message);
        prefix = stripColors(prefix);
        messagePrinter(sender, message, prefix);
    }
}