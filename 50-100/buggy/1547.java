@org.junit.Before
public void setup() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
    waitServerReady();
    if ((java.lang.System.getProperty("webdriver.gecko.driver")) == null)
        java.lang.System.setProperty("webdriver.gecko.driver", "drivers/linux/marionette/64bit/geckodriver");
    
    if (!(new java.io.File("drivers/linux/marionette/64bit/geckodriver").exists()))
        throw new java.lang.IllegalStateException("To run integration tests, you must run 'mvn clean install' at least once to download gecko driver");
    
    resetJiraMock();
    resetIssueBuffer();
    webDriver = new org.openqa.selenium.firefox.FirefoxDriver();
    webDriver.manage().window().setSize(new org.openqa.selenium.Dimension(1280, 1080));
}