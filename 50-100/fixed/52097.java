@org.testng.annotations.Test(priority = 1)
public void createClerkTest() throws java.lang.InterruptedException {
    driver = generic.LoginGeneral.callAdminLoginAction();
    java.lang.Thread.sleep(2000);
    pages.CreateClerkElements create_clerk = org.openqa.selenium.support.PageFactory.initElements(driver, pages.CreateClerkElements.class);
    create_clerk.createClerk(tests.CreateClerkTest.clerkname, tests.CreateClerkTest.clerkid, tests.CreateClerkTest.clerkidno, tests.CreateClerkTest.clerkemail, tests.CreateClerkTest.clerkpassword);
    takeScreenshot();
    java.lang.Thread.sleep(5000);
    tearDown();
}