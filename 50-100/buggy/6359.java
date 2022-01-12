@java.lang.Override
public void run() {
    while (!(isDestroyed())) {
        try {
            if (org.apache.stratos.autoscaler.monitor.cluster.ClusterMonitor.log.isDebugEnabled()) {
                org.apache.stratos.autoscaler.monitor.cluster.ClusterMonitor.log.debug(("Cluster monitor is running.. " + (this.toString())));
            }
            monitor();
        } catch (java.lang.Exception e) {
            org.apache.stratos.autoscaler.monitor.cluster.ClusterMonitor.log.error(("Cluster monitor: Monitor failed." + (this.toString())), e);
        }
        try {
            java.lang.Thread.sleep(getMonitorIntervalMilliseconds());
        } catch (java.lang.InterruptedException ignore) {
        }
    } 
}