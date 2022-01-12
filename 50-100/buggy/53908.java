public void log() {
    com.canoo.dolphin.server.config.Set<com.canoo.dolphin.server.config.Map.Entry<java.lang.Object, java.lang.Object>> properties = internalProperties.entrySet();
    for (com.canoo.dolphin.server.config.Map.Entry property : properties) {
        com.canoo.dolphin.server.config.DolphinPlatformConfiguration.LOG.debug(((("Dolphin Platform starts with value for " + (property.getKey())) + " = ") + (property.getValue())));
    }
}