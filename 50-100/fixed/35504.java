@org.testng.annotations.Test(dataProviderClass = DataProvider.class, dataProvider = "getData")
public void gmailTest(java.lang.String email, java.lang.String password) throws java.lang.Exception {
    utils.PropertiesParser propertiesParser = new utils.PropertiesParser();
    utils.ChromeDriverSingleton.getDriver().get(propertiesParser.getBaseUrl());
    pageObjects.GmailLoginPO login = new pageObjects.GmailLoginPO();
    login.typeLogin(email);
    login.typePassword(password);
}