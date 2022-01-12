@java.lang.Override
public void run() {
    if (!(isShutdown.get())) {
        pushEvent(new com.alibaba.jstorm.daemon.nimbus.TopologyMetricsRunnable.Refresh());
    }
}