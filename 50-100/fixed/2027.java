public static java.lang.String format(java.lang.String Color, java.lang.String Msg) {
    return org.bukkit.ChatColor.translateAlternateColorCodes('&', (((((("&8&l[&" + Color) + (net.zabszk.terrain.Main.getInstance().config.getString("PluginDisplayName"))) + "&8&l] ") + "&") + Color) + Msg));
}