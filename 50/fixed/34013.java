@org.testng.annotations.Test(priority = 4)
public void DeleteToken() {
    appModules.APIToken_Action.deleteToken(driver);
}