@org.testng.annotations.Test(priority = 2)
public void testClickNssfButton() throws java.lang.InterruptedException {
    driver = generic.LoginGeneral.callClerkLoginAction();
    java.lang.Thread.sleep(2000);
    java.lang.System.out.println("about to click the NHIF Card link\n");
    pages.MenuBarToggle clicknhif = org.openqa.selenium.support.PageFactory.initElements(driver, pages.MenuBarToggle.class);
    clicknhif.clickNidCardLink();
    clicknhif.clickNhifLink();
    takeScreenshot();
    java.lang.Thread.sleep(3000);
    afterTest();
}