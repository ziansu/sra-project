private java.lang.String format(java.lang.String s, org.bukkit.Material material) {
    s = s.replace("{item}", java.lang.String.valueOf(material).replace("_", " "));
    return org.bukkit.ChatColor.translateAlternateColorCodes('&', s);
}