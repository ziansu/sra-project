@lombok.SneakyThrows
private void dispatchEvent(alien4cloud.paas.IPaasEventListener listener, alien4cloud.paas.model.AbstractMonitorEvent event, int retry) {
    try {
        if (listener.canHandle(event)) {
            listener.eventHappened(event);
        }
    } catch (java.lang.Exception e) {
        log.error("Failed to dispatch event {} to listener {} retry {} on {}.", event.toString(), listener.toString(), retry, alien4cloud.paas.PaaSProviderPollingMonitor.MAX_LISTENER_RETRY, e);
        if (retry < (alien4cloud.paas.PaaSProviderPollingMonitor.MAX_LISTENER_RETRY)) {
            java.lang.Thread.sleep(alien4cloud.paas.PaaSProviderPollingMonitor.LISTENER_FAIL_RETRY_SLEEP_MS);
            dispatchEvent(listener, event, (retry + 1));
        }
    }
}