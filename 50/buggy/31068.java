public void updateWatchDog() {
    if ((watchDog) != null)
        watchDog.update(region, agent, pluginID, logger, config);
    else
        logger.error("Attempted to update a non-existent WatchDog.");
    
}