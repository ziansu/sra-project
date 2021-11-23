@org.testng.annotations.Test(description = "Tests the AngularJS developer documentation and search function", retryAnalyzer = com.frameworkium.core.common.retry.RetryFlakyTest.class)
@ru.yandex.qatools.allure.annotations.TestCaseId(value = "TEST-1")
public void angular_documentation_test() {
    java.lang.String guideTitle = com.frameworkium.integration.angularjs.pages.web.DeveloperGuidePage.open().searchDeveloperGuide("Bootstrap").clickBootstrapSearchItem().getGuideTitle();
    com.google.common.truth.Truth.assertThat(guideTitle).contains("Bootstrap");
}