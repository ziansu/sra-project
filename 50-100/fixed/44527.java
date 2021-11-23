@java.lang.Override
public synchronized void stop() {
    org.apache.lens.server.api.events.LensEventService eventService = ((org.apache.lens.server.api.events.LensEventService) (org.apache.lens.server.LensServices.get().getService(LensEventService.NAME)));
    if (eventService != null) {
        eventService.removeListener(queryStatusListener);
    }
    if ((queryStatusListener) != null) {
        queryStatusListener.stop();
    }
    if ((reporters) != null) {
        for (com.codahale.metrics.ScheduledReporter reporter : reporters) {
            reporter.stop();
        }
    }
    org.apache.lens.server.MetricsServiceImpl.LOG.info("Stopped metrics service");
    super.stop();
}