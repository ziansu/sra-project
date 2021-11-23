public static common.HistoryGraph extractData() throws java.io.IOException {
    common.Repository repository = new common.Repository(TestIsolationDataGenerator.repositoryDirName);
    common.HistoryGraph historyGraph = repository.buildHistoryGraph(TestIsolationDataGenerator.startCommitID, TestIsolationDataGenerator.endCommitID);
    return historyGraph;
}