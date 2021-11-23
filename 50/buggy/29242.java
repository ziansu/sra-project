@org.junit.Test
public void testResetUserAnonymous() {
    io.lqd.sdk.Liquid lqd = io.lqd.sdk.Liquid.initialize(Robolectric.application, "api_token");
    java.lang.String id = lqd.getUserIdentifier();
    lqd.resetUser();
    org.junit.Assert.assertEquals(id, lqd.getUserIdentifier());
}