public void saveConfig() {
    if (((fileConfiguration) == null) || ((configFile) == null)) {
        return ;
    }else {
        try {
            getConfig().save(configFile);
        } catch (java.io.IOException ex) {
            plugin.getLogger().log(java.util.logging.Level.SEVERE, ("Could not save config to " + (configFile)));
        }
    }
}