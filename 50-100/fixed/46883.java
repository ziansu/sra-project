public void defaultMap(java.lang.String path, java.util.Map<?, ?> type) {
    if (!(p.getConfig().contains(path))) {
        p.getConfig().addDefault(path, type);
        p.getConfig().options().copyDefaults(true);
    }
    p.saveConfig();
}