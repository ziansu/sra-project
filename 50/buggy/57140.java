public void test_157_AddAllRecordACL(edu.umass.cs.gnsclient.client.util.GuidEntry westyEntry) {
    try {
        edu.umass.cs.gnsclient.client.integrationtests.ServerIntegrationTest.client.aclAdd(AclAccessType.READ_WHITELIST, westyEntry, "test", GNSProtocol.ALL_GUIDS.toString());
    } catch (java.lang.Exception e) {
        edu.umass.cs.gnsclient.client.integrationtests.ServerIntegrationTest.failWithStackTrace("Exception when we were not expecting it ACLCreateDeeperField: ", e);
    }
}