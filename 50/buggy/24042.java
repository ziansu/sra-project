@org.junit.BeforeClass
public static void setUpBeforeClass() throws java.lang.Exception {
    com.lge.stark.eddard.httphandler.user.PutLogoutTest.DEVICE_ID = new com.lge.stark.eddard.httphandler.user.PostTest().registedDeviceId();
    new com.lge.stark.eddard.httphandler.user.PostTest().regist(com.lge.stark.eddard.httphandler.user.PutLogoutTest.DEVICE_ID2);
    com.lge.stark.eddard.httphandler.user.PutLogoutTest.USER_ID = new com.lge.stark.eddard.httphandler.user.com.lge.stark.eddard.httphandler.user.PutLoginTest().loginedUserId();
}