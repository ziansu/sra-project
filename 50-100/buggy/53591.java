@java.lang.SuppressWarnings(value = "deprecation")
@org.junit.Test
public void shouldFailToResumeWithResultNotOK() throws java.lang.Exception {
    org.mockito.Mockito.verifyNoMoreInteractions(callback);
    com.auth0.android.provider.WebAuthProvider.init(account).useCodeGrant(false).start(activity, callback, com.auth0.android.provider.WebAuthProviderTest.REQUEST_CODE);
    android.content.Intent intent = createAuthIntent(createHash("iToken", "aToken", null, "refresh_token", "1234567890", null));
    org.junit.Assert.assertFalse(com.auth0.android.provider.WebAuthProvider.resume(com.auth0.android.provider.WebAuthProviderTest.REQUEST_CODE, 999, intent));
}