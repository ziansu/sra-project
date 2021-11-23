@org.testng.annotations.Test
public void test() throws java.lang.InterruptedException {
    setCommonCourse();
    enrolleSuperUserAndExcutiveAdminToSameCourse();
    loginAsAdminAndEnableStudentTesting();
    prepareDataTest();
    loginAsInsAndEnableAllCourseSettings();
    tegrity.loadPage(tegrity.pageUrl, tegrity.pageTitle);
    runTestAsDiffrentUser("Admin");
    runTestAsDiffrentUser("HelpdeskAdmin");
}