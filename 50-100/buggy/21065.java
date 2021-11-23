private void reloadConfig() {
    try {
        java.io.File file = com.gmail.tracebachi.DbShare.Bungee.ConfigUtil.saveResource(this, "bungee-config.yml", "config.yml");
        config = net.md_5.bungee.config.ConfigurationProvider.getProvider(net.md_5.bungee.config.YamlConfiguration.class).load(file);
        if ((config) == null) {
            com.gmail.tracebachi.DbShare.Bungee.ConfigUtil.saveResource(this, "config.yml", "config.yml", true);
        }
    } catch (java.io.IOException e) {
        getLogger().severe("Failed to load configuration file.");
        e.printStackTrace();
    }
}