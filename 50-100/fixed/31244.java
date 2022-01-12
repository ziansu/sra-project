@org.testng.annotations.Test(priority = 11)
public void test11_test12_viewEyeIcon() {
    dashBoardPage = loginPage.loginSuccess(adminUser, adminPassword);
    classRosterMainPage = dashBoardPage.goToClassRosterTile();
    org.testng.Assert.assertTrue(classRosterMainPage.fillSearchCriteria("Automation class"));
    customeWaitTime(1);
    org.testng.Assert.assertTrue(classRosterMainPage.searchRoster());
    customeWaitTime(1);
    org.testng.Assert.assertTrue(classRosterMainPage.viewEyeIcon());
    customeWaitTime(1);
}