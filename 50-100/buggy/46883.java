public void defaultMap(java.lang.String path, java.util.Map<?, ?> type) {
    if (!(getConfig().contains(path))) {
        getConfig().addDefault(path, type);
        getConfig().options().copyDefaults(true);
    }
    saveConfig();
}