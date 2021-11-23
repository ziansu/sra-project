private void prepareDataTest() throws java.lang.InterruptedException {
    tegrity.loadPage(tegrity.pageUrl, tegrity.pageTitle);
    tegrity.loginCourses("SuperUser");
    utils.WaitDriverUtility.waitToPageBeLoaded(driver);
    initializeCourseObject();
    course.selectCourseThatStartingWith("BankValid");
    commonCourseName = "abcawsserverautomation-qa-119042017015101_Name";
    record.clickOnRecordingsTab();
    selectAndCopy();
    record.clickOnStudentRecordingsTab();
    selectAndCopy();
    record.clickOnTestsTab();
    selectAndCopy();
    addAdditionalContent();
    record.signOut();
}