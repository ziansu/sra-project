public org.sonar.plugins.stash.issue.SonarQubeIssuesReport extractIssueReport(org.sonar.api.issue.ProjectIssues projectIssues, org.sonar.plugins.stash.InputFileCache inputFileCache) {
    return org.sonar.plugins.stash.issue.collector.SonarQubeCollector.extractIssueReport(projectIssues, inputFileCache, projectBaseDir, config.includeExistingIssues());
}