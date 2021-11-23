@org.junit.Test
public void testMdpInstalled() throws java.lang.Exception {
    android.content.pm.PackageManager test = org.mockito.Mockito.mock(android.content.pm.PackageManager.class);
    org.powermock.api.mockito.PowerMockito.doReturn(test).when(mockActivity).getPackageManager();
    org.powermock.api.mockito.PowerMockito.doReturn(null).when(test).getPackageInfo(BuildConfig.MYDIGIPASS_PACKAGE_NAME, PackageManager.GET_ACTIVITIES);
    junit.framework.Assert.assertTrue(mydigipass.isMdpInstalled());
}