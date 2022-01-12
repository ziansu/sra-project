private void setIDValues(java.lang.String id, java.lang.String path, java.lang.Object o) {
    org.bukkit.configuration.file.YamlConfiguration config = org.bukkit.configuration.file.YamlConfiguration.loadConfiguration(main.getConfigManager().getConfig("SignId.yml"));
    config.set((((id.toLowerCase()) + ".") + path), o);
    try {
        config.save(main.getConfigManager().getConfig("SignId.yml"));
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}