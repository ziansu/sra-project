@java.lang.Override
public boolean start() {
    try {
        syncBladeInterval = java.lang.Integer.valueOf(configDao.getValue(Config.UCSSyncBladeInterval.key()));
    } catch (java.lang.NumberFormatException e) {
        syncBladeInterval = 600;
    }
    syncBladesExecutor = java.util.concurrent.Executors.newScheduledThreadPool(1, new com.cloud.utils.concurrency.NamedThreadFactory("UCS-SyncBlades"));
    syncBladesExecutor.scheduleAtFixedRate(new com.cloud.ucs.manager.UcsManagerImpl.SyncBladesThread(), syncBladeInterval, syncBladeInterval, java.util.concurrent.TimeUnit.SECONDS);
    return true;
}