public void loginAndGotoPage(java.lang.String username, java.lang.String password, java.lang.String pageURL) {
    if (!(username.equals(getLoggedInUserName()))) {
        getDriver().get(getURLToLoginAndGotoPage(username, password, getURL("XWiki", "Register", "register")));
        recacheSecretTokenWhenOnRegisterPage();
        if (pageURL == null) {
            getDriver().get(pageURL);
        }else {
            getDriver().get(getURLToNonExistentPage());
        }
        setDefaultCredentials(username, password);
    }
}