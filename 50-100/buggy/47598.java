public void watch(android.content.Context context, java.lang.String extDir) {
    mConfig = extDir + (com.oinux.android.ConfigLoader.CONFIG_FILE);
    initProperty();
    java.lang.String pkName = context.getPackageName();
    java.lang.String packages = get(Config.WATCH_CONFIG_PACKAGES, "");
    if (packages.contains(pkName)) {
        mScheduleExecutor = java.util.concurrent.Executors.newSingleThreadScheduledExecutor();
        int watchDelay = get(Config.WATCH_CONFIG_DELAY_TIME, 10);
        mScheduleExecutor.scheduleAtFixedRate(new com.oinux.android.ConfigLoader.WatchConfigDog(), 0, watchDelay, java.util.concurrent.TimeUnit.SECONDS);
    }else {
        android.os.Build.init();
    }
}