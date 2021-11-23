public org.openqa.selenium.WebDriver getWebDriver() {
    if ((webDriver) == null) {
        try {
            webDriver = new org.openqa.selenium.chrome.ChromeDriver();
            if (!(configurations.getDebug())) {
                webDriver.manage().window().setSize(new org.openqa.selenium.Dimension(10, 10));
            }
        } catch (java.lang.Exception e) {
            com.chaosenterprise.speed.testprovider.WebPageProvider.log.warn(e.getLocalizedMessage());
            e.printStackTrace();
        }
    }
    return webDriver;
}