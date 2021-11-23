public void defaultLocationList(java.lang.String path, java.util.List<org.bukkit.Location> type) {
    java.util.List<java.lang.String> convertedLocations = co.convertLocationListToStringList(type);
    if (!(p.getConfig().contains(path))) {
        p.getConfig().addDefault(path, convertedLocations);
        p.getConfig().options().copyDefaults(true);
    }
    p.saveConfig();
}