protected void doUpgrade(at.pcgamingfreaks.Configuration oldConfiguration) {
    logger.info("No custom config upgrade code implemented! Copying all data from old config to new one.");
    for (java.lang.String key : config.getKeys()) {
        if (oldConfiguration.config.isSet(key)) {
            if (key.equals("Version"))
                continue;
            
            config.set(key, oldConfiguration.config.getString(key, null));
        }
    }
}