public void test_132_ACLCreateFields(edu.umass.cs.gnsclient.client.util.GuidEntry westyEntry) {
    try {
        edu.umass.cs.gnsclient.client.integrationtests.ServerIntegrationTest.client.fieldUpdate(westyEntry.getGuid(), "environment", "work", westyEntry);
        edu.umass.cs.gnsclient.client.integrationtests.ServerIntegrationTest.client.fieldUpdate(westyEntry.getGuid(), "ssn", "000-00-0000", westyEntry);
        edu.umass.cs.gnsclient.client.integrationtests.ServerIntegrationTest.client.fieldUpdate(westyEntry.getGuid(), "password", "666flapJack", westyEntry);
        edu.umass.cs.gnsclient.client.integrationtests.ServerIntegrationTest.client.fieldUpdate(westyEntry.getGuid(), "address", "100 Hinkledinkle Drive", westyEntry);
    } catch (java.lang.Exception e) {
        edu.umass.cs.gnsclient.client.integrationtests.ServerIntegrationTest.failWithStackTrace("Exception while creating fields in ACLCreateFields: ", e);
    }
}