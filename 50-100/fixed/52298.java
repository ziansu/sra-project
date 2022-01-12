private org.bukkit.ChatColor getPermColor(org.bukkit.entity.Player player) {
    org.bukkit.configuration.ConfigurationSection colorSection = getConfig().getConfigurationSection("colors");
    for (java.lang.String colorName : colorSection.getKeys(false)) {
        if (player.hasPermission(("coloredplayernames." + colorName))) {
            return org.bukkit.ChatColor.getByChar(colorSection.getString((colorName + ".code")));
        }
    }
    return null;
}