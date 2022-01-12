private static void loadConfiguration() {
    com.corwinjv.achunkloader.config.ConfigurationHandler.chunkLoaderSize = com.corwinjv.achunkloader.config.ConfigurationHandler.configuration.getInt("ChunkLoaderSize", Configuration.CATEGORY_GENERAL, 5, 1, 32, "Number of chunks square to load around the chunk loader. Should be an odd number.");
    com.corwinjv.achunkloader.config.ConfigurationHandler.playerInactivityTimeout = com.corwinjv.achunkloader.config.ConfigurationHandler.configuration.getInt("PlayerInactivityTimeout", Configuration.CATEGORY_GENERAL, 80, 0, 100, "Number of hours after a player has been inactive before disabling the loader.\nUse 0 to disable.");
    if (com.corwinjv.achunkloader.config.ConfigurationHandler.configuration.hasChanged()) {
        com.corwinjv.achunkloader.config.ConfigurationHandler.configuration.save();
    }
}