public void defaultBoolean(java.lang.String path, java.lang.Boolean type) {
    if (!(getConfig().contains(path))) {
        getConfig().addDefault(path, type);
        getConfig().options().copyDefaults(true);
    }
    saveConfig();
}