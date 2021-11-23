public boolean getBoolean(java.lang.String path) {
    updateFileConfiguration();
    if (cfg.isSet(path))
        return cfg.getBoolean(path);
    
    return false;
}