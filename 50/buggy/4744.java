@org.testng.annotations.Test
public void checkHrPosition() {
    homePage = loginRegistrationPage.loginUser(userEmail, userPass);
    searchpageResults = homePage.SearchForHr();
    searchpageResults.openHrProfilePage();
    org.testng.Assert.assertTrue(hrProfilePages.checkPosition());
}