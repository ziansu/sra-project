@java.lang.Override
public void configure(java.util.Map<java.lang.String, java.lang.String> configuration) {
    java.lang.String path = com.google.common.base.Strings.emptyToNull(configuration.get(((org.dcache.alarms.spi.SnowRESTfulLogEntryListener.CONF_PREFIX) + "conf")));
    com.google.common.base.Preconditions.checkNotNull(configFile, ("No path for snow incident " + "configuration file was found."));
    configFile = new java.io.File(path);
}