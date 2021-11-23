public static java.lang.String replaceColorCodes(java.lang.String message) {
    for (org.bukkit.ChatColor color : org.bukkit.ChatColor.values()) {
        message = message.replaceAll(java.lang.String.format("&%c", new java.lang.Object[]{ java.lang.Character.valueOf(color.getChar()) }), color.toString());
    }
    return message;
}