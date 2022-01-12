public void loadConfig() {
    if (new java.io.File((((("plugins" + (java.io.File.separator)) + "SignColors") + (java.io.File.separator)) + "config.yml")).exists()) {
        org.bukkit.configuration.file.FileConfiguration cfg = this.getConfig();
        cfg.options().copyDefaults(true);
    }else {
        saveDefaultConfig();
        org.bukkit.configuration.file.FileConfiguration cfg = this.getConfig();
        cfg.options().copyDefaults(true);
    }
}