private void newConfig(java.io.File file) {
    try {
        if (!(plugin.getDataFolder().exists())) {
            plugin.getDataFolder().mkdir();
        }
        plugin.saveResource(CONFIG_PATH, true);
        plugin.getLogger().info("Config extracted successfully!");
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        config = null;
    }
}