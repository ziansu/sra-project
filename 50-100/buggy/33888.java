private java.util.List<hudson.model.ModelObject> newRuns(long startId, long endId) throws java.io.IOException {
    java.util.List<hudson.model.ModelObject> runs = new java.util.ArrayList<hudson.model.ModelObject>();
    for (long queueId = startId; queueId <= endId; queueId++) {
        runs.add(new jenkins.widgets.HistoryPageFilterTest.MockRun(queueId));
    }
    return runs;
}