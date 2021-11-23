public org.bukkit.ChatColor getColor(java.lang.String message) {
    for (org.bukkit.ChatColor color : org.bukkit.ChatColor.values()) {
        if (message.contains(color.toString()))
            return color;
        
    }
    return org.bukkit.ChatColor.WHITE;
}