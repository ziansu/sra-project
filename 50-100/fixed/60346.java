public void test_135_ACLMaybeAddAllFieldsForMaster(edu.umass.cs.gnsclient.client.util.GuidEntry westyEntry) {
    try {
        if (!(edu.umass.cs.gnsclient.client.util.JSONUtils.JSONArrayToArrayList(edu.umass.cs.gnsclient.client.integrationtests.ServerIntegrationTest.client.aclGet(AclAccessType.READ_WHITELIST, westyEntry, GNSProtocol.ENTIRE_RECORD.toString(), westyEntry.getGuid())).contains(edu.umass.cs.gnsclient.client.integrationtests.ServerIntegrationTest.masterGuid.getGuid()))) {
            edu.umass.cs.gnsclient.client.integrationtests.ServerIntegrationTest.client.aclAdd(AclAccessType.READ_WHITELIST, westyEntry, GNSProtocol.ENTIRE_RECORD.toString(), edu.umass.cs.gnsclient.client.integrationtests.ServerIntegrationTest.masterGuid.getGuid());
        }
    } catch (java.lang.Exception e) {
        edu.umass.cs.gnsclient.client.integrationtests.ServerIntegrationTest.failWithStackTrace(("Exception while checking for ALL_FIELDS in ACLMaybeAddAllFields: " + e));
    }
}