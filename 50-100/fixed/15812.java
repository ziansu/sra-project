public static boolean editCategory(me.semakon.TitlesPlugin plugin, java.lang.String title, java.lang.String category) {
    org.bukkit.configuration.ConfigurationSection config = plugin.getConfig().getConfigurationSection("Titles");
    if ((config != null) && (config.contains(title.toLowerCase()))) {
        config.set((title + (me.semakon.Utils.CAT)), category.toLowerCase());
        plugin.saveConfig();
        return true;
    }
    return false;
}