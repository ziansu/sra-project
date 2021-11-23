public hudson.plugins.testng.Publisher getNewPublisher() {
    return new hudson.plugins.testng.Publisher(reportFilenamePattern, escapeTestDescp, escapeExceptionMsg, showFailedBuilds, failureOnFailedTestConfig, unstableSkips, unstableFails, failedSkips, failedFails, thresholdMode);
}