@java.lang.Override
public void onDisable() {
    uiServer.stop();
    org.bukkit.Bukkit.getScheduler().cancelTasks(this);
    if ((handler) != null) {
        log("Saving cached data..");
        java.util.concurrent.ScheduledExecutorService scheduler = java.util.concurrent.Executors.newScheduledThreadPool(1);
        scheduler.execute(() -> {
            handler.saveCacheOnDisable();
        });
        scheduler.shutdown();
    }
    log("Player Analytics Disabled.");
}