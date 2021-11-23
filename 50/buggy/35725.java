@com.slickqa.testng.AfterMethod
public void cleanupMethod() {
    logger.get().flushLogs();
}