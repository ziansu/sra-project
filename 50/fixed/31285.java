public java.lang.Boolean apply(net.serenitybdd.core.pages.WebDriver driver) {
    try {
        if (webElement.isCurrentlyVisible()) {
            return true;
        }
    } catch (net.serenitybdd.core.pages.NoSuchElementException noSuchElement) {
    }
    return false;
}