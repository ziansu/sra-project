@org.testng.annotations.Test
public void testUserNotRegistered() throws java.lang.Exception {
    ______TS("student pages");
    loginStudent(teammates.test.cases.ui.browsertests.AllAccessControlUiTests.unregUsername, teammates.test.cases.ui.browsertests.AllAccessControlUiTests.unregPassword);
    verifyRedirectToWelcomeStrangerPage(createUrl(Const.ActionURIs.STUDENT_HOME_PAGE), teammates.test.cases.ui.browsertests.AllAccessControlUiTests.unregUsername);
    ______TS("instructor pages");
    loginInstructorUnsuccessfully(teammates.test.cases.ui.browsertests.AllAccessControlUiTests.unregUsername, teammates.test.cases.ui.browsertests.AllAccessControlUiTests.unregPassword);
    teammates.common.util.AppUrl url = createUrl(Const.ActionURIs.INSTRUCTOR_HOME_PAGE);
    verifyRedirectToNotAuthorized(url);
    verifyCannotMasquerade(url, teammates.test.cases.ui.browsertests.AllAccessControlUiTests.otherInstructor.googleId);
    ______TS("admin pages");
    verifyCannotAccessAdminPages();
    ______TS("incorrect URL");
    teammates.common.util.AppUrl nonExistentActionUrl = createUrl("/page/nonExistentAction");
    @java.lang.SuppressWarnings(value = "unused")
    teammates.test.pageobjects.NotFoundPage notFoundPage = teammates.test.pageobjects.AppPage.getNewPageInstance(teammates.test.cases.ui.browsertests.AllAccessControlUiTests.browser, nonExistentActionUrl, teammates.test.pageobjects.NotFoundPage.class);
}