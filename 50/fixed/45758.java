private static java.lang.String translateColor(java.lang.String msg) {
    if (msg == null)
        return null;
    
    return org.bukkit.ChatColor.translateAlternateColorCodes('&', msg);
}