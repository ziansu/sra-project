@java.lang.Override
public void stop() {
    if (isStarted.compareAndSet(true, false)) {
        java.util.concurrent.ScheduledExecutorService service = this.syncService.getAndSet(newSyncService());
        service.shutdown();
        com.cisco.oss.foundation.directory.lookup.CachedDirectoryLookupService.LOGGER.info("Cache sync Service is shutdown");
        getCache().clear();
        getMetadataKeyCache().clear();
    }
}