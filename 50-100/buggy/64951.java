@org.testng.annotations.Test(groups = { "UITest" })
public void testVerifyOnClickCampAddPatientbuttonVisibilty() {
    java.lang.System.out.println("Verify that on click on Camp nav Add Patient button will be visible");
    dashboardpage.onTapDashboardtext();
    com.qa.mobileapp.common.GlobalUtil.wait(2);
    dashboardpage.onTapMyTasksExpandButton();
    com.qa.mobileapp.common.GlobalUtil.wait(2);
    camppage.onClickCampNavBar();
    org.testng.Assert.assertNotNull(driver.findElement(camppage.getAddPatientBtnLocator()));
}