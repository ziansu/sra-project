public void defaultInteger(java.lang.String path, java.lang.Integer type) {
    if (!(p.getConfig().contains(path))) {
        p.getConfig().addDefault(path, type);
        p.getConfig().options().copyDefaults(true);
    }
    p.saveConfig();
}