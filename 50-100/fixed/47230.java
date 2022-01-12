@org.testng.annotations.Test(priority = 1)
public void testClickNhifButton() throws java.lang.InterruptedException {
    driver = generic.LoginGeneral.callClerkLoginAction();
    java.lang.Thread.sleep(2000);
    java.lang.System.out.println("about to click the ID Cards link\n");
    pages.MenuBarToggle clicknid = org.openqa.selenium.support.PageFactory.initElements(driver, pages.MenuBarToggle.class);
    clicknid.clickNidCardLink();
    takeScreenshot();
    java.lang.Thread.sleep(3000);
    afterTest();
}