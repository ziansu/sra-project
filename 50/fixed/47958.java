protected void stopWatchService() {
    if ((watchService) != null) {
        try {
            watchService.close();
        } catch (java.io.IOException e) {
            logger.warn("Cannot deactivate folder watcher", e);
        }
        watchService = null;
    }
}