public void checkRegion(com.applitools.eyes.selenium.WebElement element, boolean stitchContent) {
    if (stitchContent) {
        checkElement(element);
    }else {
        checkRegion(element);
    }
}