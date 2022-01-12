public void test_150_ACLCreateDeeperField(edu.umass.cs.gnsclient.client.util.GuidEntry westyEntry) {
    try {
        try {
            edu.umass.cs.gnsclient.client.integrationtests.ServerIntegrationTest.client.fieldUpdate(westyEntry.getGuid(), "test.deeper.field", "fieldValue", westyEntry);
        } catch (java.lang.Exception e) {
            edu.umass.cs.gnsclient.client.integrationtests.ServerIntegrationTest.failWithStackTrace("Problem updating field: ", e);
        }
    } catch (java.lang.Exception e) {
        edu.umass.cs.gnsclient.client.integrationtests.ServerIntegrationTest.failWithStackTrace("Exception when we were not expecting it ACLCreateDeeperField: ", e);
    }
}