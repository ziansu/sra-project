public void test_140_AddACLTest(edu.umass.cs.gnsclient.client.util.GuidEntry westyEntry, edu.umass.cs.gnsclient.client.util.GuidEntry samEntry) {
    try {
        try {
            edu.umass.cs.gnsclient.client.integrationtests.ServerIntegrationTest.client.aclAdd(AclAccessType.READ_WHITELIST, westyEntry, "environment", samEntry.getGuid());
        } catch (java.lang.Exception e) {
            edu.umass.cs.gnsclient.client.integrationtests.ServerIntegrationTest.failWithStackTrace(("Exception adding Sam to Westy's readlist: " + e));
        }
    } catch (java.lang.Exception e) {
        edu.umass.cs.gnsclient.client.integrationtests.ServerIntegrationTest.failWithStackTrace(("Exception when we were not expecting it in ACLPartOne: " + e));
    }
}