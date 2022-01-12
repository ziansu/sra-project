@java.lang.Override
public void onStart(org.testng.ITestContext iTestContext) {
    getLifecycle().fire(new ru.yandex.qatools.allure.events.TestSuiteStartedEvent(getSuiteUid(iTestContext), getCurrentSuiteTitle(iTestContext)).withTitle(getCurrentSuiteTitle(iTestContext)).withLabels(ru.yandex.qatools.allure.config.AllureModelUtils.createTestFrameworkLabel("TestNG")));
    addPendingMethods(iTestContext);
}