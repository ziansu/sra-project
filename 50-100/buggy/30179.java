public void test_137_ACLReadMyFields(edu.umass.cs.gnsclient.client.util.GuidEntry westyEntry) {
    try {
        org.junit.Assert.assertEquals("work", edu.umass.cs.gnsclient.client.integrationtests.ServerIntegrationTest.client.fieldRead(westyEntry.getGuid(), "environment", westyEntry));
        org.junit.Assert.assertEquals("000-00-0000", edu.umass.cs.gnsclient.client.integrationtests.ServerIntegrationTest.client.fieldRead(westyEntry.getGuid(), "ssn", westyEntry));
    } catch (java.lang.Exception e) {
        edu.umass.cs.gnsclient.client.integrationtests.ServerIntegrationTest.failWithStackTrace("Exception while reading fields in ACLReadMyFields: ", e);
    }
}