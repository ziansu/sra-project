public void testClear() throws java.lang.Exception {
    com.squareup.okhttp.mockwebserver.MockResponse cloudSuccessResponse = new com.squareup.okhttp.mockwebserver.MockResponse();
    cloudSuccessResponse.addHeader("Content-Type", "application/json");
    cloudSuccessResponse.setBody("{'status':'ok'}");
    mockWebServer.enqueue(cloudSuccessResponse);
    com.feedhenry.sdk.api.FHAuthSession authSession = com.feedhenry.sdk.api.FHAuthSession.instance;
    authSession.clear(true);
    boolean exists = authSession.exists();
    assertFalse(exists);
}