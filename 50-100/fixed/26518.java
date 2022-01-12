public void test_152_ACLCheckDeeperFieldACLExists(edu.umass.cs.gnsclient.client.util.GuidEntry westyEntry) {
    try {
        try {
            org.junit.Assert.assertTrue(edu.umass.cs.gnsclient.client.integrationtests.ServerIntegrationTest.client.fieldAclExists(AclAccessType.READ_WHITELIST, westyEntry, "test.deeper.field"));
        } catch (java.lang.Exception e) {
            edu.umass.cs.gnsclient.client.integrationtests.ServerIntegrationTest.failWithStackTrace(("Problem reading acl: " + e));
        }
    } catch (java.lang.Exception e) {
        edu.umass.cs.gnsclient.client.integrationtests.ServerIntegrationTest.failWithStackTrace(("Exception when we were not expecting it ACLCreateDeeperField: " + e));
    }
}