public void testKeepSessionOnIdentify() throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException {
    io.lqd.sdk.Liquid lqd = io.lqd.sdk.Liquid.initialize(Robolectric.application, "le_token");
    java.lang.reflect.Field f = io.lqd.sdk.Liquid.class.getDeclaredField("mCurrentSession");
    f.setAccessible(true);
    java.lang.String session_id = ((io.lqd.sdk.model.LQSession) (f.get(lqd))).getIdentifier();
    lqd.identifyUser("le_user_id");
    org.junit.Assert.assertEquals(session_id, ((io.lqd.sdk.model.LQSession) (f.get(lqd))).getIdentifier());
}