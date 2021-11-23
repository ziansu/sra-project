public boolean checkAtLoginPage() {
    waitUntilAppears(org.openqa.selenium.By.id("sgnBt"));
    return isElementPresent(org.openqa.selenium.By.id("sgnBt"));
}