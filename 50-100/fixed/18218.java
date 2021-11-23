public java.lang.String openNewAndSwitch() {
    final java.util.Set<java.lang.String> oldWindowHandles = driver.getWindowHandles();
    java.lang.String oldWindowHandle = driver.getWindowHandle();
    org.openqa.selenium.JavascriptExecutor jse = ((org.openqa.selenium.JavascriptExecutor) (driver));
    jse.executeScript("window.open('someUrl', '_blank')");
    waitForNewWindowToOpen(oldWindowHandles);
    switchToLast(oldWindowHandle);
    return oldWindowHandle;
}