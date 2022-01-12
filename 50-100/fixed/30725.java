@java.lang.Override
public void onReceive(java.lang.Object message) throws java.lang.Throwable {
    if (message instanceof com.monitorjbl.timberflow.monitor.StatsMessage) {
        com.monitorjbl.timberflow.monitor.StatsMessage stats = ((com.monitorjbl.timberflow.monitor.StatsMessage) (message));
        throughput.put(stats.getPluginName(), stats.getMessagesPerMillisecond());
    }else {
        unhandled(message);
    }
}