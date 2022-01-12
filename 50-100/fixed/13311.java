@org.testng.annotations.Test
public void testTheHubLogin() {
    PageObjects.TheHub theHub = new PageObjects.TheHub(PageObjects.General.driver);
    General.driver.get(TheHub.theHubUrl);
    General.driver.manage().window().maximize();
    theHub.setLoginEmail(TheHub.userName);
    theHub.setLoginPassword(TheHub.password);
    theHub.clickOnLoginButton();
}