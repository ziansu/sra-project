public void reset() {
    log.debug("Resetting test run.");
    vars.clear();
    stepIndex = -1;
    if ((driver) != null) {
        driver.quit();
        driver = null;
    }
}