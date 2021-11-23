public com.sgoertzen.sonarbreak.qualitygate.Result execute(com.sgoertzen.sonarbreak.qualitygate.Query query) throws com.sgoertzen.sonarbreak.SonarBreakException, java.io.IOException {
    java.net.URL queryURL = com.sgoertzen.sonarbreak.QueryExecutor.buildURL(sonarURL, query);
    log.debug(("Built a sonar query url of: " + (queryURL.toString())));
    if (!(isURLAvailable(queryURL, com.sgoertzen.sonarbreak.QueryExecutor.SONAR_CONNECTION_RETRIES))) {
        throw new com.sgoertzen.sonarbreak.SonarBreakException(java.lang.String.format("Unable to get a valid response after %d tries", com.sgoertzen.sonarbreak.QueryExecutor.SONAR_CONNECTION_RETRIES));
    }
    return fetchSonarStatusWithRetries(queryURL, query.getVersion());
}