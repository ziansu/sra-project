public void setLocationList(java.lang.String path, java.util.List<org.bukkit.Location> type) {
    java.util.List<java.lang.String> convertedLocations = co.convertLocationListToStringList(type);
    p.getConfig().set(path, convertedLocations);
    p.saveConfig();
}