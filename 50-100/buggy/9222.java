@java.lang.Override
public void onTaskRemoved(android.content.Intent rootIntent) {
    log.debug("Task has been removed");
    if (config.getStopOnTerminate()) {
        log.info("Stopping self");
        stopSelf();
    }else {
        log.info("Continue running in background");
    }
    super.onTaskRemoved(rootIntent);
}