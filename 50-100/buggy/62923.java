public void defaultDouble(java.lang.String path, java.lang.Double type) {
    if (!(getConfig().contains(path))) {
        getConfig().addDefault(path, type);
        getConfig().options().copyDefaults(true);
    }
    saveConfig();
}