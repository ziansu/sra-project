@org.junit.Test
public void testMdpNotInstalledPackageNotFound() throws java.lang.Exception {
    android.content.pm.PackageManager test = org.mockito.Mockito.mock(android.content.pm.PackageManager.class);
    org.mockito.Mockito.doReturn(test).when(mockActivity).getPackageManager();
    org.mockito.Mockito.doThrow(new android.content.pm.PackageManager.NameNotFoundException()).when(test).getPackageInfo(BuildConfig.MYDIGIPASS_PACKAGE_NAME, PackageManager.GET_ACTIVITIES);
    junit.framework.Assert.assertFalse(mydigipass.isMdpInstalled());
}