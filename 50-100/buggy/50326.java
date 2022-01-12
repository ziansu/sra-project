private org.fundacionjala.sfdc.pages.Home verifyCorrectUser(java.lang.String userName, java.lang.String password, org.fundacionjala.sfdc.pages.Home homePage) {
    org.fundacionjala.sfdc.pages.Profile profile = homePage.clickProfileLinkLabel();
    if (!(profile.isCorrectUserLogged(userName))) {
        homePage.clickLogOutLink();
        homePage = loginAs(userName, password);
    }
    return homePage;
}