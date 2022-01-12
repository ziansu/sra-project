private void addAttemptsToTaskStats(org.apache.hadoop.mapred.TaskCompletionEvent[] events) {
    for (org.apache.hadoop.mapred.TaskCompletionEvent event : events) {
        if (event == null) {
            cascading.stats.hadoop.HadoopStepStats.LOG.warn("found empty completion event");
            continue;
        }
        if ((event.isMapTask()) || ((reducerNodeStats) == null))
            mapperNodeStats.addAttempt(event);
        else
            reducerNodeStats.addAttempt(event);
        
    }
}