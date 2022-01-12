public static void verifyVideoPlay(final com.wikia.webdriver.pageobjectsfactory.componentobject.ad.AutoplayVuap vuap) {
    org.testng.Assert.assertTrue(vuap.hasStarted(), "VUAP did not automatically played when page was opened.");
    org.testng.Assert.assertEquals(vuap.findTitle(), "Advertisement", "VUAP video title is not Advertisement.");
}