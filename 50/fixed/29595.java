public boolean executionWasParallel() {
    java.util.List<java.lang.String> lines = betsy.common.tasks.FileTasks.readAllLines(betsy.bpmn.engines.OverlappingTimestampCheckerTests.PATH_LOG_FILE);
    return (!(lines.isEmpty())) && (lines.get(0).contains(BPMNAssertions.EXECUTION_PARALLEL.toString()));
}