public static void verifyVideoTimeIsProgressing(final com.wikia.webdriver.pageobjectsfactory.componentobject.ad.AutoplayVuap vuap) {
    vuap.togglePause();
    final double startProgressBarWidth = vuap.getProgressBarWidth();
    com.wikia.webdriver.pageobjectsfactory.componentobject.ad.VuapAssertions.playVideoForFewSeconds(vuap);
    org.testng.Assert.assertTrue((startProgressBarWidth < (vuap.getProgressBarWidth())), "Video time indicator should move.");
}