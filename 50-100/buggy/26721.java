public void test_138_ACLNotReadOtherGuidAllFieldsTest(edu.umass.cs.gnsclient.client.util.GuidEntry westyEntry, edu.umass.cs.gnsclient.client.util.GuidEntry samEntry) {
    try {
        try {
            java.lang.String result = edu.umass.cs.gnsclient.client.integrationtests.ServerIntegrationTest.client.fieldRead(westyEntry.getGuid(), GNSProtocol.ENTIRE_RECORD.toString(), samEntry);
            edu.umass.cs.gnsclient.client.integrationtests.ServerIntegrationTest.failWithStackTrace((("Result of read of all of westy's fields by sam is " + result) + " which is wrong because it should have been rejected."));
        } catch (edu.umass.cs.gnscommon.exceptions.client.ClientException e) {
        }
    } catch (java.lang.Exception e) {
        edu.umass.cs.gnsclient.client.integrationtests.ServerIntegrationTest.failWithStackTrace(("Exception while reading fields in ACLNotReadOtherGuidAllFieldsTest: " + e));
    }
}