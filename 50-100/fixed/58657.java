public void test_158_ACLReadDeeperFieldOtherFail(edu.umass.cs.gnsclient.client.util.GuidEntry westyEntry, edu.umass.cs.gnsclient.client.util.GuidEntry samEntry) {
    try {
        try {
            org.junit.Assert.assertEquals("fieldValue", edu.umass.cs.gnsclient.client.integrationtests.ServerIntegrationTest.client.fieldRead(westyEntry.getGuid(), "test.deeper.field", samEntry));
            edu.umass.cs.gnsclient.client.integrationtests.ServerIntegrationTest.failWithStackTrace("This read should have failed.");
        } catch (java.lang.Exception e) {
        }
    } catch (java.lang.Exception e) {
        edu.umass.cs.gnsclient.client.integrationtests.ServerIntegrationTest.failWithStackTrace("Exception when we were not expecting it ACLCreateDeeperField: ", e);
    }
}