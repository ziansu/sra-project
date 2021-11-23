public void testVerify() throws java.lang.Exception {
    com.squareup.okhttp.mockwebserver.MockResponse cloudSuccessResponse = new com.squareup.okhttp.mockwebserver.MockResponse();
    cloudSuccessResponse.addHeader("Content-Type", "application/json");
    cloudSuccessResponse.setBody("{'status':'ok', 'isValid': true}");
    mockWebServer.enqueue(cloudSuccessResponse);
    com.feedhenry.sdk.api.FHAuthSession.verify(new com.feedhenry.sdk.api.FHAuthSession.Callback() {
        @java.lang.Override
        public void handleSuccess(final boolean isValid) {
            valid = isValid;
        }

        @java.lang.Override
        public void handleError(com.feedhenry.sdk.FHResponse pRes) {
        }
    }, true);
    assertTrue(valid);
    assertEquals(com.feedhenry.sdk.tests.api.FHAuthSessionTest.TEST_TOKEN, com.feedhenry.sdk.api.FHAuthSession.getToken());
}