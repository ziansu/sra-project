public V apply(ua.net.itlabs.core.WebDriver input) {
    try {
        return condition.apply(input);
    } catch (ua.net.itlabs.core.StaleElementReferenceException | ua.net.itlabs.core.ElementNotVisibleException | java.lang.IndexOutOfBoundsException e) {
        return null;
    }
}