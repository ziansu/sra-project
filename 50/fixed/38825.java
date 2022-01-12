@org.testng.annotations.AfterClass
public void logout() {
    adminHomePage = ((spot.pages.admin.AdminHomePage) (allUsersOverViewPage.goToHomePage(adminHomePage)));
    adminHomePage.logout();
}