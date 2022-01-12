@java.lang.Override
public void run() {
    com.unbelievable.munin.MuninNode mn = com.unbelievable.utils.Generic.getMuninNode(nodeId);
    try {
        if (mn != null) {
            mn.run();
        }else {
            com.unbelievable.muninmxcd.logger.error((("Tried to Run job for NodeID: " + (nodeId)) + " but this node is not in nodelist :("));
        }
    } catch (java.lang.Exception ex) {
        com.unbelievable.muninmxcd.logger.info(((mn.getHostname()) + "Monitoring job stopped - Terminated"));
        com.unbelievable.muninmxcd.logger.error(("JobRunner exception: " + (ex.getLocalizedMessage())));
    }
}