public void defaultLocationList(java.lang.String path, java.util.List<org.bukkit.Location> type) {
    java.util.List<java.lang.String> convertedLocations = co.convertLocationListToStringList(type);
    if (!(getConfig().contains(path))) {
        getConfig().addDefault(path, convertedLocations);
        getConfig().options().copyDefaults(true);
    }
    saveConfig();
}