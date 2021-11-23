public void close() {
    if ((this.wrappedDriver) == null) {
        return ;
    }
    org.concordion.cubano.driver.web.Browser.LOGGER.debug("Closing browser");
    removeScreenshotTaker();
    try {
        this.eventFiringDriver.unregister(this.eventListener);
        this.eventFiringDriver.close();
        this.eventFiringDriver.quit();
    } catch (java.lang.Exception ex) {
        org.concordion.cubano.driver.web.Browser.LOGGER.warn(("Exception attempting to quit the browser: " + (ex.getMessage())));
    }
    this.eventFiringDriver = null;
    this.wrappedDriver = null;
}