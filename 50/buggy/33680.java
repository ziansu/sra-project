public void webDriverSetUp() {
    driver1 = new org.openqa.selenium.firefox.FirefoxDriver();
    org.openqa.selenium.support.ui.WebDriverWait wait = new org.openqa.selenium.support.ui.WebDriverWait(driver1, 40);
}