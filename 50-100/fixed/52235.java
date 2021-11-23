public boolean elementIsPresent(final org.openqa.selenium.By byElementCriteria) {
    boolean isDisplayed = true;
    try {
        java.util.List<org.openqa.selenium.WebElement> matchingElements = driver.findElements(byElementCriteria);
        if (matchingElements.isEmpty()) {
            isDisplayed = false;
        }
    } catch (org.openqa.selenium.NoSuchElementException noSuchElement) {
        net.thucydides.core.pages.RenderedPageObjectView.LOGGER.trace(("No such element " + noSuchElement));
        isDisplayed = false;
    }
    return isDisplayed;
}