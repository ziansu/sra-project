public void processInstanceRegistryEvent(@javax.enterprise.event.Observes
com.philipp.instanceadmin.control.InstanceRegistryEvent instanceEvent) {
    java.lang.System.out.println(("received instance registry event: " + (instanceEvent.getinstanceRegistryAction())));
    this.sendMetricsToInflux(instanceEvent.getinstanceRegistryAction());
    point = new com.philipp.metrics.entity.InfluxPoint();
    point.addMeasurement("instance");
    point.addTag("action", instanceEvent.getinstanceRegistryAction());
    point.addTimeStamp(instanceEvent.getEventTimestamp());
}