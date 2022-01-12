public java.lang.Object getConfig(java.lang.String key, @javax.annotation.Nullable
java.lang.Object defaultt) {
    org.bukkit.configuration.file.FileConfiguration spellConfig = HPS.ConfigurationManager.getConfig(ConfigurationType.SPELL).get();
    return defaultt == null ? spellConfig.get(((("spells." + (getName())) + ".") + key)) : spellConfig.get(((("spells." + (getName())) + ".") + key), defaultt);
}