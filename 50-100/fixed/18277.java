@org.testng.annotations.BeforeClass
public void setUp() throws java.io.IOException {
    java.lang.System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
    driver = new org.openqa.selenium.chrome.ChromeDriver();
    driver.get(((uri) + "/risk/trics/login"));
    driver.manage().timeouts().implicitlyWait(1, java.util.concurrent.TimeUnit.SECONDS);
    new_dir(root_path);
}