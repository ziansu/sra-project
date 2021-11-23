@org.testng.annotations.AfterClass
public void logout() {
    adminHomePage = ((spot.pages.admin.AdminHomePage) (allUsersOverViewPage.goToHomePage(adminHomePage)));
    logout(org.openqa.selenium.support.PageFactory.initElements(driver, spot.pages.admin.AdminHomePage.class));
}