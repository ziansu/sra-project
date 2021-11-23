@org.junit.Test
public void testHandleResultNoMdpIntent() throws java.lang.Exception {
    android.content.Intent appIntent = org.mockito.Mockito.mock(android.content.Intent.class);
    org.mockito.Mockito.doReturn(null).when(appIntent).getStringExtra("redirect-uri");
    mydigipass.handleResult(1, 1, appIntent);
    org.mockito.Mockito.verify(mockActivity, org.mockito.Mockito.never()).onMDPAuthenticationSuccess(org.mockito.Matchers.any(com.vasco.mydigipass.sdk.MDPResponse.class));
    org.mockito.Mockito.verify(mockActivity, org.mockito.Mockito.never()).onMDPAuthenticationFail(org.mockito.Matchers.any(com.vasco.mydigipass.sdk.MDPResponse.class));
}