public boolean isElementPresent(com.epam.AirBaltic.pages.By by) {
    boolean result = (driver.findElements(by).size()) > 0;
    return result;
}