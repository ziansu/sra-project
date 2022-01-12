public void test_144_ACLCreateFields(edu.umass.cs.gnsclient.client.util.GuidEntry barneyEntry) {
    try {
        edu.umass.cs.gnsclient.client.integrationtests.ServerIntegrationTest.client.fieldUpdate(barneyEntry.getGuid(), "cell", "413-555-1234", barneyEntry);
        edu.umass.cs.gnsclient.client.integrationtests.ServerIntegrationTest.client.fieldUpdate(barneyEntry.getGuid(), "address", "100 Main Street", barneyEntry);
    } catch (java.lang.Exception e) {
        edu.umass.cs.gnsclient.client.integrationtests.ServerIntegrationTest.failWithStackTrace("Exception when we were not expecting it in ACLPartTwo: ", e);
    }
}