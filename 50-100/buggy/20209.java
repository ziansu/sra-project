@java.lang.Override
protected void succeeded(org.junit.runner.Description description) {
    if (driverProvider.isInitialized()) {
        if (integrationFactory.appliTools().isEnabled()) {
            integrationFactory.appliTools().getEyes().close();
        }
        driverProvider.get().quit();
    }
}