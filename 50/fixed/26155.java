public org.bukkit.configuration.file.FileConfiguration getIslandConfig(final java.lang.String location) {
    if ((islands.get(location)) == null) {
        reloadIslandConfig(location);
    }
    return islands.get(location);
}