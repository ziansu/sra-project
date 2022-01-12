@java.lang.Override
public void run() {
    try {
        while (true) {
            org.mule.runtime.core.management.stats.DefaultProcessingTimeWatcher.ProcessingTimeReference ref = ((org.mule.runtime.core.management.stats.DefaultProcessingTimeWatcher.ProcessingTimeReference) (queue.remove()));
            refs.remove(ref);
            org.mule.runtime.core.management.stats.FlowConstructStatistics stats = ref.getStatistics();
            if (stats.isEnabled()) {
                stats.addCompleteFlowExecutionTime(ref.getAccumulator().longValue());
            }
        } 
    } catch (java.lang.InterruptedException ex) {
        java.lang.Thread.currentThread().interrupt();
    }
}