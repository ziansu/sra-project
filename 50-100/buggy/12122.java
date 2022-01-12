public void test_145_ACLUpdateACL(edu.umass.cs.gnsclient.client.util.GuidEntry barneyEntry) {
    try {
        try {
            edu.umass.cs.gnsclient.client.integrationtests.ServerIntegrationTest.client.aclAdd(AclAccessType.READ_WHITELIST, barneyEntry, "cell", GNSProtocol.ALL_GUIDS.toString());
        } catch (java.lang.Exception e) {
            edu.umass.cs.gnsclient.client.integrationtests.ServerIntegrationTest.failWithStackTrace("Exception creating ALL_GUIDS access for Barney's cell: ", e);
        }
    } catch (java.lang.Exception e) {
        edu.umass.cs.gnsclient.client.integrationtests.ServerIntegrationTest.failWithStackTrace("Exception when we were not expecting it in ACLPartTwo: ", e);
    }
}