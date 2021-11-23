@org.testng.annotations.Test(enabled = false)
public void testUpdateResult_0args() throws java.lang.Exception {
    com.cognizant.cognizantits.engine.reporting.sync.jira.JIRAClient jc = new com.cognizant.cognizantits.engine.reporting.sync.jira.JIRAClient(com.cognizant.cognizantits.engine.reporting.sync.jira.JIRAClientTest.Data.server, com.cognizant.cognizantits.engine.reporting.sync.jira.JIRAClientTest.Data.uname, com.cognizant.cognizantits.engine.reporting.sync.jira.JIRAClientTest.Data.pass);
    java.lang.String f = "report.txt";
    com.cognizant.cognizantits.engine.reporting.sync.jira.JIRAHttpClient httpclient = new com.cognizant.cognizantits.engine.reporting.sync.jira.JIRAHttpClient(jc.url, com.cognizant.cognizantits.engine.reporting.sync.jira.JIRAClientTest.Data.uname, com.cognizant.cognizantits.engine.reporting.sync.jira.JIRAClientTest.Data.pass, null);
    int eid = jc.updateResult(ZAPIClient.status.UNEXECUTED, "buyProduct", "TestSet_Demo", "Release_Demo", "DemonProject", httpclient);
    jc.updateResult(ZAPIClient.status.PASS, eid, httpclient);
    java.lang.String out = jc.addAttachment(eid, new java.io.File(f), httpclient);
    com.cognizant.cognizantits.engine.support.DLogger.Log(out);
}