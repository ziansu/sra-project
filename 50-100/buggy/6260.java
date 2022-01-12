public void defaultFloat(java.lang.String path, java.lang.Float type) {
    if (!(getConfig().contains(path))) {
        getConfig().addDefault(path, type);
        getConfig().options().copyDefaults(true);
    }
    saveConfig();
}