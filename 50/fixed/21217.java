@org.junit.Test(expected = java.lang.NullPointerException.class)
public void testCreateSessionWithInvalidParams() {
    com.shopify.unity.buy.AndroidPayCheckoutSession session = new com.shopify.unity.buy.AndroidPayCheckoutSession(this.mockActivity, true);
    session.checkoutWithAndroidPay(null, null, null, "{}", "CAD", "CA", false);
}