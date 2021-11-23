@org.junit.Test
public void testPowerMockito() throws java.lang.Exception {
    com.vasco.mydigipass.sdk.MDPMobile spy = org.powermock.api.mockito.PowerMockito.spy(mydigipass);
    org.mockito.Mockito.doReturn(true).when(spy).isMdpInstalled();
    junit.framework.Assert.assertTrue(spy.isMdpInstalled());
}