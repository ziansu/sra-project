public void test_146_ACLTestReadsOne(edu.umass.cs.gnsclient.client.util.GuidEntry barneyEntry, edu.umass.cs.gnsclient.client.util.GuidEntry samEntry) {
    try {
        try {
            org.junit.Assert.assertEquals("413-555-1234", edu.umass.cs.gnsclient.client.integrationtests.ServerIntegrationTest.client.fieldRead(barneyEntry.getGuid(), "cell", samEntry));
        } catch (java.lang.Exception e) {
            edu.umass.cs.gnsclient.client.integrationtests.ServerIntegrationTest.failWithStackTrace(("Exception while Sam reading Barney' cell: " + e));
        }
    } catch (java.lang.Exception e) {
        edu.umass.cs.gnsclient.client.integrationtests.ServerIntegrationTest.failWithStackTrace(("Exception when we were not expecting it in ACLPartOne: " + e));
    }
}