@java.lang.Override
public void runTask() throws java.lang.Exception {
    taskLog("Started looking for out of date FirstTimeCandidacies");
    cancelAllCandidaciesPastPeriods();
    taskLog("Finished looking for out of date FirstTimeCandidacies");
}