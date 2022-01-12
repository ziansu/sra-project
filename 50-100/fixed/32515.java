@org.junit.Test
public void testWebFlowNoIntent() {
    org.mockito.Mockito.verify(mockActivity, org.mockito.Mockito.never()).onMDPAuthenticationSuccess(org.mockito.Matchers.any(com.vasco.mydigipass.sdk.MDPResponse.class));
    org.mockito.Mockito.doReturn(null).when(mockActivity).getIntent();
    mydigipass.webFlow();
}