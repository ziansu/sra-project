private void scheduleFeasibles() {
    org.eclipse.californium.reverseproxy.resources.ReverseProxyResource.LOGGER.log(java.util.logging.Level.INFO, "scheduleFeasibles()");
    boolean end = false;
    while (!end) {
        org.eclipse.californium.reverseproxy.resources.ScheduleResults ret = schedule(null);
        end = ret.isValid();
        if (!end) {
            org.eclipse.californium.core.qos.QoSObserveRelation client = minPmaxClient();
            if (client != null) {
                deleteSubscriptionFromProxy(client);
            }else
                end = true;
            
        }else {
            boolean periodChanged = updatePeriods(ret);
            if (periodChanged) {
                setObservingQoS();
            }
        }
    } 
}