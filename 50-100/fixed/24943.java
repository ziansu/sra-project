@java.lang.Override
public void initialize() {
    logger.debug("Initializing RokuDevice handler '{}'", getThing().getUID());
    java.lang.Number refreshInterval = ((java.lang.Number) (this.getConfig().get(org.openhab.binding.roku.internal.handler.REFRESH_INTERVAL)));
    scheduler.scheduleWithFixedDelay(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            updateData();
        }
    }, 0, refreshInterval.longValue(), java.util.concurrent.TimeUnit.SECONDS);
    logger.debug("Polling job scheduled to run every {} sec. for '{}'", refreshInterval, getThing().getUID());
}