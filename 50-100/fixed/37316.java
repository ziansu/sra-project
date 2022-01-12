private void prepareDataTest() throws java.lang.InterruptedException {
    tegrity.loadPage(tegrity.pageUrl, tegrity.pageTitle);
    tegrity.loginCourses("SuperUser");
    utils.WaitDriverUtility.waitToPageBeLoaded(driver);
    initializeCourseObject();
    course.selectCourseThatStartingWith("BankValid");
    record.clickOnRecordingsTab();
    selectAndCopy();
    record.clickOnStudentRecordingsTab();
    selectAndCopy();
    record.clickOnTestsTab();
    selectAndCopy();
    addAdditionalContent();
    record.signOut();
}