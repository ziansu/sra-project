public void test_131_ACLRemoveAllFields(edu.umass.cs.gnsclient.client.util.GuidEntry westyEntry, edu.umass.cs.gnsclient.client.util.GuidEntry samEntry) {
    try {
        edu.umass.cs.gnsclient.client.integrationtests.ServerIntegrationTest.client.aclRemove(AclAccessType.READ_WHITELIST, westyEntry, GNSProtocol.ENTIRE_RECORD.toString(), GNSProtocol.ALL_GUIDS.toString());
        edu.umass.cs.gnsclient.client.integrationtests.ServerIntegrationTest.client.aclRemove(AclAccessType.READ_WHITELIST, samEntry, GNSProtocol.ENTIRE_RECORD.toString(), GNSProtocol.ALL_GUIDS.toString());
    } catch (java.lang.Exception e) {
        edu.umass.cs.gnsclient.client.integrationtests.ServerIntegrationTest.failWithStackTrace("Exception while removing ACL in ACLRemoveAllFields: ", e);
    }
}