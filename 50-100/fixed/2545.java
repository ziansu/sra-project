public static void verifyVideoTimeIsProgressing(final com.wikia.webdriver.pageobjectsfactory.componentobject.ad.AutoplayVuap vuap) {
    vuap.togglePause();
    final double startProgressBarWidth = vuap.getProgressBarWidth();
    vuap.playVideoForFewSeconds();
    org.testng.Assert.assertTrue((startProgressBarWidth < (vuap.getProgressBarWidth())), "Video time indicator should move.");
}