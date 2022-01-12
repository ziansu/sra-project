@com.slickqa.testng.BeforeMethod(alwaysRun = true)
public void setupMethod(org.testng.ITestContext testContext) {
    com.slickqa.testng.SlickResult slickResult = ((com.slickqa.testng.SlickResult) (testContext.getAttribute(SlickResult.slickResultTestContextIdentifier)));
    if ((slickResult.getSlickClient()) != null) {
        logger.set(new com.slickqa.testng.SlickResultLogger(slickResult));
        fileAttacher.set(new com.slickqa.testng.SlickFileAttacher(slickResult));
    }
}