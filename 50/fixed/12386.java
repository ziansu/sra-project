public boolean isElementPresent(com.epam.AirBaltic.pages.By by) {
    return (driver.findElements(by).size()) > 0;
}