@java.lang.Override
public void doSleep(long waitTime) throws java.lang.Exception {
    if ((this.webdriver) == null) {
        prepareWebdriver();
    }
    nl.dictu.prova.plugins.output.web.selenium.Selenium.LOGGER.debug(">> Sleep '{}' ms", waitTime);
    try {
        java.lang.Thread.sleep(waitTime);
    } catch (java.lang.Exception eX) {
        nl.dictu.prova.plugins.output.web.selenium.Selenium.LOGGER.debug("Exception while waiting '{}' ms: {}", waitTime, eX.getMessage());
        throw eX;
    }
}