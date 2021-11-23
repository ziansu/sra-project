public boolean elementIsPresent(final net.serenitybdd.core.pages.By byElementCriteria) {
    boolean isDisplayed = true;
    try {
        java.util.List<net.serenitybdd.core.pages.WebElement> matchingElements = driver.findElements(byElementCriteria);
        if (matchingElements.isEmpty()) {
            isDisplayed = false;
        }
    } catch (net.serenitybdd.core.pages.NoSuchElementException noSuchElement) {
        net.serenitybdd.core.pages.RenderedPageObjectView.LOGGER.trace(("No such element " + noSuchElement));
        isDisplayed = false;
    }
    return isDisplayed;
}