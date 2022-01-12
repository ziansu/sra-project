public void excuteAllTestCase(frame.autotest.driver.Driver driver) {
    methodAction = frame.autotest.driver.TestAction.getAction(driver);
    methods = methodAction.getClass().getMethods();
    for (com.ht.model.TestCase testCase : com.ht.model.TestContainer.allTestCase) {
        driver.caseName = testCase.getCaseName();
        this.excuteTestCase(driver, testCase);
    }
    driver.caseName = null;
}