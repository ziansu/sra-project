public void defaultList(java.lang.String path, java.util.List<?> type) {
    if (!(getConfig().contains(path))) {
        getConfig().addDefault(path, type);
        getConfig().options().copyDefaults(true);
    }
    saveConfig();
}