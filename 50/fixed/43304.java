public void updateTestDuration(java.lang.String testId, java.lang.String testDuration, jetbrains.buildServer.agent.BuildProgressLogger logger) {
    com.blaze.utils.Utils.updateTestDuration(this.blazemeterAPI, testId, testDuration, logger);
}