public static java.util.List<java.lang.String> getTitlesFromCategory(org.bukkit.configuration.ConfigurationSection config, java.lang.String category) {
    java.util.List<java.lang.String> titles = new java.util.ArrayList<>();
    for (java.lang.String title : config.getKeys(false)) {
        if (config.getString((title + (me.semakon.Utils.CAT))).equalsIgnoreCase(category))
            config.getString((title + (me.semakon.Utils.NAME)));
        
    }
    return titles;
}