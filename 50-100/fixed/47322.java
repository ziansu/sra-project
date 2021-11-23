public void run() {
    java.util.Date start = new java.util.Date();
    try {
        log("Starting ...");
        loadCollectionParams();
        collectDurations();
    } catch (java.lang.Exception e) {
        log(e);
    } finally {
        if ((driver) != null) {
            driver.quit();
            driver = null;
        }
        log(("Finished, started at : " + (start.toString())));
    }
}