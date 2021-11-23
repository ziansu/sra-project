public io.appium.java_client.android.AndroidDriver<org.openqa.selenium.WebElement> getDriver() {
    if ((this.driver) == null) {
        try {
            this.initDriver();
        } catch (java.net.MalformedURLException e) {
            e.printStackTrace();
        }
    }
    return this.driver;
}