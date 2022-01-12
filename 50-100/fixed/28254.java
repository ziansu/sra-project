private java.lang.String getProperty(java.lang.String property) {
    java.lang.String val = null;
    org.bukkit.configuration.ConfigurationSection props = CityZen.cityConfig.getConfig().getConfigurationSection(((("cities." + (getAffiliation().getIdentifier())) + ".plots.") + (identifier)));
    val = props.getString(property);
    return val;
}