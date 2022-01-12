public void stopAll() throws java.lang.Exception {
    for (java.lang.Integer i : runningMonitors.keySet()) {
        com.amazonaws.services.kinesis.scaling.auto.StreamMonitor monitor = runningMonitors.get(i);
        com.amazonaws.services.kinesis.scaling.auto.AutoscalingController.LOG.debug((("Stopping Stream Monitor: " + (monitor.getConfig().getStreamName())) + " ..."));
        monitor.stop();
        monitorFutures.get(i).get();
        com.amazonaws.services.kinesis.scaling.auto.AutoscalingController.LOG.debug((("Stream Monitor: " + (monitor.getConfig().getStreamName())) + " stopped"));
    }
}