@org.testng.annotations.Test(enabled = false)
public void testUpdateResult_0args() throws java.lang.Exception {
    com.cognizant.cognizantits.engine.reporting.sync.jira.JIRAClient jc = new com.cognizant.cognizantits.engine.reporting.sync.jira.JIRAClient(com.cognizant.cognizantits.engine.reporting.sync.jira.JIRAClientTest.Data.server, com.cognizant.cognizantits.engine.reporting.sync.jira.JIRAClientTest.Data.uname, com.cognizant.cognizantits.engine.reporting.sync.jira.JIRAClientTest.Data.pass, null);
    java.lang.String f = "report.txt";
    int eid = jc.updateResult(ZAPIClient.status.UNEXECUTED, "buyProduct", "TestSet_Demo", "Release_Demo", "DemonProject");
    jc.updateResult(ZAPIClient.status.PASS, eid);
    java.lang.String out = jc.addAttachment(eid, new java.io.File(f));
    com.cognizant.cognizantits.engine.support.DLogger.Log(out);
}