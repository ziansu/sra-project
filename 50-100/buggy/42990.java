@android.test.suitebuilder.annotation.SmallTest
public void testOnActivityResult_MissingIntentData() throws java.security.NoSuchAlgorithmException, javax.crypto.NoSuchPaddingException {
    com.microsoft.aad.adal.test.FileMockContext mockContext = new com.microsoft.aad.adal.test.FileMockContext(getContext());
    final com.microsoft.aad.adal.AuthenticationContext authContext = getAuthenticationContext(mockContext, com.microsoft.aad.adal.test.AuthenticationContextTest.VALID_AUTHORITY, false, null);
    int requestCode = AuthenticationConstants.UIRequest.BROWSER_FLOW;
    int resultCode = AuthenticationConstants.UIResponse.TOKEN_BROKER_RESPONSE;
    com.microsoft.aad.adal.test.TestLogResponse logResponse = new com.microsoft.aad.adal.test.TestLogResponse();
    java.lang.String msgToCheck = "onActivityResult BROWSER_FLOW data is null";
    logResponse.listenLogForMessageSegments(null, msgToCheck);
    authContext.onActivityResult(requestCode, resultCode, null);
    assertTrue(logResponse.message.contains(msgToCheck));
}