private net.thucydides.core.webdriver.WebDriver providedDriver() {
    net.thucydides.core.webdriver.ProvidedDriverConfiguration sourceConfig = new net.thucydides.core.webdriver.ProvidedDriverConfiguration(environmentVariables);
    try {
        return sourceConfig.getDriverSource().newDriver();
    } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException(("Could not instantiate the custom webdriver provider of type " + (sourceConfig.getDriverName())), e);
    }
}