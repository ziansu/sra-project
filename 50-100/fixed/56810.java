public org.openqa.selenium.WebElement getFrameForElement(org.openqa.selenium.WebDriver driver, org.openqa.selenium.By byForElement) {
    driver.switchTo().defaultContent();
    java.util.List<org.openqa.selenium.WebElement> frames = driver.findElements(org.openqa.selenium.By.tagName("iframe"));
    return frames.get(getIndexFrame(driver, byForElement));
}