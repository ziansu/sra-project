public boolean getBoolean(java.lang.String path) {
    updateFileConfiguration();
    return (cfg.isSet(path)) && (cfg.getBoolean(path));
}