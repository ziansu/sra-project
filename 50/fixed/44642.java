public void startup() {
    for (java.lang.Runnable task : updaterTasks) {
        scheduler.scheduleWithFixedDelay(task, 0, 1, java.util.concurrent.TimeUnit.MINUTES);
    }
}