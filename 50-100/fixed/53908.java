public void log() {
    java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> properties = internalProperties.entrySet();
    for (java.util.Map.Entry property : properties) {
        com.canoo.dolphin.server.config.DolphinPlatformConfiguration.LOG.debug(((("Dolphin Platform starts with value for " + (property.getKey())) + " = ") + (property.getValue())));
    }
}