public void test_153_ACLReadDeeperFieldSelf(edu.umass.cs.gnsclient.client.util.GuidEntry westyEntry) {
    try {
        try {
            org.junit.Assert.assertEquals("fieldValue", edu.umass.cs.gnsclient.client.integrationtests.ServerIntegrationTest.client.fieldRead(westyEntry.getGuid(), "test.deeper.field", westyEntry));
        } catch (java.lang.Exception e) {
            edu.umass.cs.gnsclient.client.integrationtests.ServerIntegrationTest.failWithStackTrace("Problem adding read field: ", e);
        }
    } catch (java.lang.Exception e) {
        edu.umass.cs.gnsclient.client.integrationtests.ServerIntegrationTest.failWithStackTrace("Exception when we were not expecting it ACLCreateDeeperField: ", e);
    }
}