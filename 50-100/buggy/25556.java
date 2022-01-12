public void test_139_ACLNotReadOtherGuidFieldTest(edu.umass.cs.gnsclient.client.util.GuidEntry westyEntry, edu.umass.cs.gnsclient.client.util.GuidEntry samEntry) {
    try {
        try {
            java.lang.String result = edu.umass.cs.gnsclient.client.integrationtests.ServerIntegrationTest.client.fieldRead(westyEntry.getGuid(), "environment", samEntry);
            edu.umass.cs.gnsclient.client.integrationtests.ServerIntegrationTest.failWithStackTrace((("Result of read of westy's environment by sam is " + result) + " which is wrong because it should have been rejected."));
        } catch (edu.umass.cs.gnscommon.exceptions.client.ClientException e) {
        }
    } catch (java.lang.Exception e) {
        edu.umass.cs.gnsclient.client.integrationtests.ServerIntegrationTest.failWithStackTrace(("Exception while reading fields in ACLNotReadOtherGuidFieldTest: " + e));
    }
}