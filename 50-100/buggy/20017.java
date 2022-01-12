public static void waitForNewURL(org.openqa.selenium.WebDriver instance, java.lang.String url) {
    long endTimeMillis = (java.lang.System.currentTimeMillis()) + 5000;
    while ((core.Browser.getURL(instance)) != url) {
        if ((java.lang.System.currentTimeMillis()) > endTimeMillis) {
            core.Logger.info(("timed out waiting for new URL: " + url));
            break;
        }
    } 
}