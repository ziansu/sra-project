@java.lang.Override
public synchronized void stop() {
    org.apache.lens.server.api.events.LensEventService eventService = ((org.apache.lens.server.api.events.LensEventService) (org.apache.lens.server.LensServices.get().getService(LensEventService.NAME)));
    eventService.removeListener(queryStatusListener);
    queryStatusListener.stop();
    for (com.codahale.metrics.ScheduledReporter reporter : reporters) {
        reporter.stop();
    }
    org.apache.lens.server.MetricsServiceImpl.LOG.info("Stopped metrics service");
    super.stop();
}