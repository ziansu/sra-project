public java.lang.String startIt(java.lang.String gitRepository) throws java.io.IOException, javax.xml.parsers.ParserConfigurationException, org.xml.sax.SAXException {
    long lStartTime = java.lang.System.currentTimeMillis();
    org.json.JSONObject oJsonResult = null;
    de.htwg.konstanz.cloud.model.SeverityCounter oSeverityCounter = new de.htwg.konstanz.cloud.model.SeverityCounter();
    checkLocalCheckstyle();
    java.util.List<java.util.List<java.lang.String>> lRepoList = downloadRepoAndGetPath(gitRepository);
    oJsonResult = checkStyle(lRepoList, gitRepository, oSeverityCounter, lStartTime);
    if ((oRepoDir) != null) {
        org.apache.commons.io.FileUtils.deleteDirectory(oRepoDir);
    }
    return oJsonResult.toString();
}