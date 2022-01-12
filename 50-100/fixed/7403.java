public boolean elementIsDisplayed(final net.serenitybdd.core.pages.By byElementCriteria) {
    try {
        waitFor(net.serenitybdd.core.pages.ExpectedConditions.visibilityOfAllElementsLocatedBy(byElementCriteria));
        return true;
    } catch (net.serenitybdd.core.pages.NoSuchElementException noSuchElement) {
        return false;
    } catch (net.serenitybdd.core.pages.StaleElementReferenceException se) {
        return false;
    } catch (net.serenitybdd.core.pages.TimeoutException iGuessItsNotThere) {
        return false;
    }
}