@java.lang.Override
protected void startBackgroundDiscovery() {
    org.openhab.binding.max.internal.discovery.MaxCubeBridgeDiscovery.logger.debug("Start MAX! Cube background discovery");
    if (((cubeDiscoveryJob) == null) || (cubeDiscoveryJob.isCancelled())) {
        cubeDiscoveryJob = scheduler.scheduleAtFixedRate(cubeDiscoveryRunnable, 0, refreshInterval, java.util.concurrent.TimeUnit.SECONDS);
    }
}