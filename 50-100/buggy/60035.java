public void retrieveJUNITXML(java.lang.String session, jetbrains.buildServer.agent.BuildRunnerContext buildRunnerContext) {
    java.lang.String junitReport = this.blazemeterAPI.retrieveJUNITXML(session);
    logger.message("Received Junit report from server.... Saving it to the disc...");
    java.lang.String reportFilePath = (((buildRunnerContext.getWorkingDirectory()) + "/") + session) + ".xml";
    com.blaze.utils.Utils.saveReport(session, junitReport, reportFilePath, logger);
}