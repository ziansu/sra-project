public static void loadConfig(java.lang.String name) {
    org.vitrivr.cineast.core.config.Config config = new org.vitrivr.cineast.core.util.json.JacksonJsonProvider().toObject(new java.io.File(name), org.vitrivr.cineast.core.config.Config.class);
    org.vitrivr.cineast.core.config.Config.LOGGER.info("Config file loaded!");
    if (config == null) {
        org.vitrivr.cineast.core.config.Config.LOGGER.warn("Could not read config file '{}'.", name);
    }else {
        synchronized(org.vitrivr.cineast.core.config.Config.class) {
            org.vitrivr.cineast.core.config.Config.sharedConfig = config;
        }
    }
}