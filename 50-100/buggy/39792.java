public void onEnable() {
    com.settingdust.loreattr.LoreAttributes.config = getConfig();
    com.settingdust.loreattr.LoreAttributes.config.options().copyDefaults(true);
    saveConfig();
    if ((com.settingdust.loreattr.LoreAttributes.loreManager) == null) {
        com.settingdust.loreattr.LoreAttributes.loreManager = new com.settingdust.loreattr.LoreManager(this);
    }
    org.bukkit.Bukkit.getServer().getPluginManager().registerEvents(new com.settingdust.loreattr.LoreEvents(), this);
}