public void checkRegion(com.applitools.eyes.selenium.WebElement element, java.lang.String tag, boolean stitchContent) {
    if (stitchContent) {
        checkElement(element, tag);
    }else {
        checkRegion(element, tag);
    }
}