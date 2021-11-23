@com.slickqa.testng.AfterMethod
public void cleanupMethod() {
    if ((logger.get()) != null) {
        logger.get().flushLogs();
    }
}