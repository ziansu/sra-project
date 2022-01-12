public org.sonar.batch.bootstrapper.Batch executeTask(java.util.Map<java.lang.String, java.lang.String> analysisProperties, org.sonar.batch.bootstrapper.IssueListener issueListener) {
    checkStarted();
    bootstrapContainer.executeAnalysis(analysisProperties, components, issueListener);
    return this;
}