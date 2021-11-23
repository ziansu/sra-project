private java.util.List<hudson.model.ModelObject> newRuns(long startId, long endId) throws java.io.IOException {
    java.util.List<hudson.model.ModelObject> runs = new java.util.ArrayList<>();
    for (long queueId = endId; queueId >= startId; queueId--) {
        runs.add(new jenkins.widgets.HistoryPageFilterTest.MockRun(queueId));
    }
    return runs;
}