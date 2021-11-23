public V apply(ua.net.itlabs.core.WebDriver input) {
    try {
        return condition.apply(input);
    } catch (ua.net.itlabs.core.StaleElementReferenceException e) {
        return null;
    } catch (ua.net.itlabs.core.ElementNotVisibleException e) {
        return null;
    } catch (java.lang.IndexOutOfBoundsException e) {
        return null;
    }
}