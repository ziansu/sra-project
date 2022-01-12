public static void reloadLang() {
    if ((me.cadox8.riveth.utils.RFileLoader.langFile) == null)
        me.cadox8.riveth.utils.RFileLoader.langFile = new java.io.File(me.cadox8.riveth.utils.RFileLoader.plugin.getDataFolder(), "lang.yml");
    
    me.cadox8.riveth.utils.RFileLoader.lang = org.bukkit.configuration.file.YamlConfiguration.loadConfiguration(me.cadox8.riveth.utils.RFileLoader.langFile);
    java.io.InputStream defStream = me.cadox8.riveth.utils.RFileLoader.plugin.getResource("lang.yml");
    if (defStream != null) {
        org.bukkit.configuration.file.YamlConfiguration defConfig = org.bukkit.configuration.file.YamlConfiguration.loadConfiguration(me.cadox8.riveth.utils.RFileLoader.langFile);
        me.cadox8.riveth.utils.RFileLoader.lang.setDefaults(defConfig);
    }
}