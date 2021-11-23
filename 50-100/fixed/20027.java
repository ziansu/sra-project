public boolean enabled(java.lang.String module) {
    return ((getConfig().getBoolean(module)) && ((!(module.startsWith("gameplay_"))) || (enabled("gameplay")))) && ((!(module.startsWith("townymods_"))) || (enabled("townymods")));
}