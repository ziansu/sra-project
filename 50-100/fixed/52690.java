public synchronized void initialize() throws co.cask.cdap.api.dataset.DatasetManagementException, java.io.IOException {
    table = tableUtil.getMetaTable();
    com.google.common.base.Preconditions.checkNotNull(table, "Could not get dataset client for data set: %s", ScheduleStoreTableUtil.SCHEDULE_STORE_DATASET_NAME);
    upgradeCacheLoader = com.google.common.cache.CacheBuilder.newBuilder().expireAfterWrite(1, java.util.concurrent.TimeUnit.MINUTES).build(new co.cask.cdap.internal.app.runtime.schedule.store.UpgradeValueLoader(co.cask.cdap.internal.app.runtime.schedule.store.DatasetBasedStreamSizeScheduleStore.NAME, factory, tableUtil.getMetaTable(), storeInitialized));
    storeInitialized.set(true);
}