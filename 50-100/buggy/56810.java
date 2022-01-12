public org.openqa.selenium.WebElement getFrameForElement(org.openqa.selenium.WebDriver driver, org.openqa.selenium.By byForElement) {
    driver.switchTo().defaultContent();
    java.util.List<org.openqa.selenium.WebElement> frames = driver.findElements(org.openqa.selenium.By.tagName("iframe"));
    java.lang.System.out.println(((java.lang.Integer.toString(frames.size())) + " cantidad de frames."));
    java.lang.System.out.println(("getFrameForElement thing " + (java.lang.Integer.toString(getIndexFrame(driver, byForElement)))));
    return frames.get(getIndexFrame(driver, byForElement));
}