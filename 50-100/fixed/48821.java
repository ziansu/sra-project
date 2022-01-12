public void defaultString(java.lang.String path, java.lang.String type) {
    if (!(p.getConfig().contains(path))) {
        p.getConfig().addDefault(path, type);
        p.getConfig().options().copyDefaults(true);
    }
    p.saveConfig();
}