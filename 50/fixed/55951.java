private boolean isAfterSuiteConfigMethod(org.testng.ITestResult iTestResult) {
    return ru.yandex.qatools.allure.testng.AllureTestListener.ConfigMethodType.AfterSuite.equals(getConfigMethodType(iTestResult));
}