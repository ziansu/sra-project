public void defaultBoolean(java.lang.String path, java.lang.Boolean type) {
    if (!(p.getConfig().contains(path))) {
        p.getConfig().addDefault(path, type);
        p.getConfig().options().copyDefaults(true);
    }
    p.saveConfig();
}