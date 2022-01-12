public void setUpConfig() {
    addObject("MySQL.host", "localhost");
    addObject("MySQL.port", 3306);
    addObject("MySQL.database", "FFA");
    addObject("MySQL.username", "username");
    addObject("MySQL.password", "password");
    addObject("prefix", "&9FFA &8| &7");
    addObject("MapChange.enable", true);
    addObject("MapChange.defaultMap", "world");
    addObject("MapChange.repatingTime", 600);
    addObject("MapChange.cancleForcemapTime", 30);
    cfg.options().copyDefaults(true);
    saveConfig();
}