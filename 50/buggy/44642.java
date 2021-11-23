public void startup() {
    for (java.lang.Runnable task : updaterTasks) {
        scheduler.scheduleWithFixedDelay(task, 0, 5, java.util.concurrent.TimeUnit.MINUTES);
    }
}