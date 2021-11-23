protected com.codeborne.selenide.impl.WebDriver markForAutoClose(com.codeborne.selenide.impl.WebDriver webDriver) {
    ALL_WEB_DRIVERS_THREADS.add(java.lang.Thread.currentThread());
    if (!(cleanupThreadStarted.get())) {
        synchronized(this) {
            if (!(cleanupThreadStarted.get())) {
                new com.codeborne.selenide.impl.WebDriverThreadLocalContainer.UnusedWebdriversCleanupThread().start();
                cleanupThreadStarted.set(true);
            }
        }
    }
    java.lang.Runtime.getRuntime().addShutdownHook(new com.codeborne.selenide.impl.WebDriverThreadLocalContainer.WebdriversFinalCleanupThread(java.lang.Thread.currentThread()));
    return webDriver;
}