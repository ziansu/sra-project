public java.util.List<net.serenitybdd.core.pages.net.serenitybdd.core.pages.WebElementFacade> findAll(net.serenitybdd.core.pages.By bySelector) {
    java.util.List<net.serenitybdd.core.pages.net.serenitybdd.core.pages.WebElementFacade> results;
    try {
        pageObject.setImplicitTimeout(0, java.util.concurrent.TimeUnit.SECONDS);
        if (timeoutCanBeOverriden) {
            overrideWaitForTimeoutTo(new net.serenitybdd.core.pages.Duration(0, java.util.concurrent.TimeUnit.SECONDS));
        }
        waitFor(bySelector);
        results = pageObject.findAll(bySelector);
        if (timeoutCanBeOverriden) {
            resetWaitForTimeout();
        }
        pageObject.resetImplicitTimeout();
    } catch (net.serenitybdd.core.pages.TimeoutException e) {
        return com.google.common.collect.Lists.newArrayList();
    }
    return results;
}