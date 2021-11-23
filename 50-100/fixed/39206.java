public static boolean editDescription(me.semakon.TitlesPlugin plugin, java.lang.String title, java.lang.String description) {
    org.bukkit.configuration.ConfigurationSection config = plugin.getConfig().getConfigurationSection("Titles");
    if ((config != null) && (config.contains(title.toLowerCase()))) {
        config.set((title + (me.semakon.Utils.DESC)), description);
        plugin.saveConfig();
        return true;
    }
    return false;
}