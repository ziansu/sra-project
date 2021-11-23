private static void preShutdown() {
    ch.ethz.geco.gecko.GECkO.logger.info("Shutting down...");
    try {
        ch.ethz.geco.gecko.ConfigManager.saveConfig();
    } catch (java.io.IOException e) {
        ch.ethz.geco.gecko.GECkO.logger.error(("Failed to save config file: " + (e.getMessage())));
    }
}