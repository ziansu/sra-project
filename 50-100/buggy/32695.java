@com.thoughtworks.gauge.BeforeSpec
public void setup() {
    io.github.bonigarcia.wdm.ChromeDriverManager.getInstance().setup();
    org.openqa.selenium.remote.DesiredCapabilities capability = org.openqa.selenium.remote.DesiredCapabilities.chrome();
    org.openqa.selenium.chrome.ChromeOptions options = new org.openqa.selenium.chrome.ChromeOptions();
    options.addArguments("--use-fake-ui-for-media-stream");
    capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
    capability.setCapability(ChromeOptions.CAPABILITY, options);
    org.bahmni.gauge.common.DriverFactory.driver = new org.openqa.selenium.chrome.ChromeDriver(capability);
    org.bahmni.gauge.common.DriverFactory.driver.manage().window().setSize(new org.openqa.selenium.Dimension(1440, 900));
}