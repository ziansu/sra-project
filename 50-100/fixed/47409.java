public static void waitForPageToLoad(final org.openqa.selenium.WebDriver webDriver2) {
    try {
        final int halfASecond = 500;
        java.lang.Thread.sleep((10 * halfASecond));
        if (!(com.leonarduk.web.SeleniumUtils.isInternetAvailable())) {
            com.leonarduk.web.BaseSeleniumPage.LOGGER.warn(("no internet - can't load " + (webDriver2.getCurrentUrl())));
            com.leonarduk.web.BaseSeleniumPage.waitForPageToLoad(webDriver2);
            webDriver2.get(webDriver2.getCurrentUrl());
        }
    } catch (final java.lang.InterruptedException e) {
        com.leonarduk.web.BaseSeleniumPage.LOGGER.info("Interrupted", e);
    }
}