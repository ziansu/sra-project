private void calculateHeaderSizeToCut(at.willhaben.willtest.util.WebDriver webDriver) {
    try {
        at.willhaben.willtest.util.WebElement headerElement = webDriver.findElement(topElementToRemove);
        int height = headerElement.getSize().getHeight();
        if (height > (headerToCut)) {
            headerToCut = height;
        }
    } catch (org.openqa.selenium.NoSuchElementException | at.willhaben.willtest.util.TimeoutException e) {
        at.willhaben.willtest.util.FixedTopBarShootingStrategy.LOGGER.warn(((("Can't find element [" + (topElementToRemove)) + "] to calculate the height of the top ") + "navigation. Remove height is set to zero."));
    }
}