public static void swipeFullLeftAfter(io.appium.java_client.AppiumDriver driver, com.salesforceiq.augmenteddriver.util.AugmentedFunctions<?> augmentedFunctions, org.openqa.selenium.By by, int waitTimeInSeconds) {
    com.google.common.base.Preconditions.checkNotNull(by);
    com.google.common.base.Preconditions.checkNotNull(driver);
    com.google.common.base.Preconditions.checkNotNull(augmentedFunctions);
    org.openqa.selenium.WebElement element = augmentedFunctions.findElementPresentAfter(by, waitTimeInSeconds);
    com.salesforceiq.augmenteddriver.util.MobileUtil.swipeFullLeftAfter(driver, augmentedFunctions, element, waitTimeInSeconds);
}