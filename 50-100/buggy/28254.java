private java.lang.String getProperty(java.lang.String property) {
    java.lang.String val = "";
    org.bukkit.configuration.ConfigurationSection props = CityZen.cityConfig.getConfig().getConfigurationSection(((("cities." + (getAffiliation().getIdentifier())) + ".plots.") + (identifier)));
    for (java.lang.String prop : props.getKeys(false)) {
        if (prop.equalsIgnoreCase(property)) {
            val = props.getString(property);
            break;
        }
    }
    return val;
}