public static void sendMessage(org.bukkit.command.CommandSender sender, java.lang.String message) {
    message = com.wasteofplastic.askyblock.placeholders.PlaceholderHandler.replacePlaceholders(((org.bukkit.entity.Player) (sender)), message);
    if (!(org.bukkit.ChatColor.stripColor(message).trim().isEmpty())) {
        for (java.lang.String part : message.split("\n")) {
            sender.sendMessage(part);
        }
    }
}