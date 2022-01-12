private void initConfig() {
    saveDefaultConfig();
    if ((getConfig().get("nametag-format")) == null) {
        saveDefaultConfig(true);
        reloadConfig();
    }
}