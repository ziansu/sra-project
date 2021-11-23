public static org.openqa.selenium.WebDriver remoteDriver() {
    org.openqa.selenium.remote.DesiredCapabilities caps = org.openqa.selenium.remote.DesiredCapabilities.chrome();
    caps.setCapability("platform", "Windows 10");
    caps.setCapability("version", "57.0");
    caps.setCapability("screenResolution", "1280x1024");
    org.openqa.selenium.remote.RemoteWebDriver driver = new org.openqa.selenium.remote.RemoteWebDriver(com.epam.jdi.uitests.web.selenium.driver.SauceLabRunner.getSauceUrl(), null);
    driver.executeScript((("sauce:job-name= Autotest from travis job #" + (java.lang.System.getenv("TRAVIS_JOB_NUMBER"))) + "\""));
    return driver;
}