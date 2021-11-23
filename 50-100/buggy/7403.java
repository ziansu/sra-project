public boolean elementIsDisplayed(final net.serenitybdd.core.pages.By byElementCriteria) {
    try {
        waitFor(net.serenitybdd.core.pages.ExpectedConditions.visibilityOfAllElementsLocatedBy(byElementCriteria));
        return true;
    } catch (net.serenitybdd.core.pages.NoSuchElementException noSuchElement) {
        net.serenitybdd.core.pages.RenderedPageObjectView.LOGGER.trace(("No such element " + noSuchElement));
        return false;
    } catch (net.serenitybdd.core.pages.StaleElementReferenceException se) {
        net.serenitybdd.core.pages.RenderedPageObjectView.LOGGER.trace(("Element no longer attached to the DOM " + se));
        return false;
    } catch (net.serenitybdd.core.pages.TimeoutException iGuessItsNotThere) {
        return false;
    }
}