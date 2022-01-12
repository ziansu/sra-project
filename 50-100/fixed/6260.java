public void defaultFloat(java.lang.String path, java.lang.Float type) {
    if (!(p.getConfig().contains(path))) {
        p.getConfig().addDefault(path, type);
        p.getConfig().options().copyDefaults(true);
    }
    p.saveConfig();
}