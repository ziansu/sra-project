private static void preShutdown() {
    ch.ethz.geco.gecko.GECkO.logger.info("Shutting down...");
    ch.ethz.geco.gecko.ConfigManager.saveConfig();
}