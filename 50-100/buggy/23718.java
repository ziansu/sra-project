public void test_151_ACLAddDeeperFieldACL(edu.umass.cs.gnsclient.client.util.GuidEntry westyEntry) {
    try {
        try {
            edu.umass.cs.gnsclient.client.integrationtests.ServerIntegrationTest.client.fieldCreateAcl(AclAccessType.READ_WHITELIST, westyEntry, "test.deeper.field");
        } catch (java.lang.Exception e) {
            edu.umass.cs.gnsclient.client.integrationtests.ServerIntegrationTest.failWithStackTrace("Problem adding acl: ", e);
        }
    } catch (java.lang.Exception e) {
        edu.umass.cs.gnsclient.client.integrationtests.ServerIntegrationTest.failWithStackTrace("Exception when we were not expecting it ACLCreateDeeperField: ", e);
    }
}