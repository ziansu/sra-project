@org.junit.Before
public void setup() {
    java.lang.String os = java.lang.System.getProperty("os.name").toLowerCase();
    if (os.contains("windows")) {
        java.lang.System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    }else {
        java.lang.System.setProperty("webdriver.chrome.driver", "chromedriver");
    }
    browser = new org.openqa.selenium.chrome.ChromeDriver();
}