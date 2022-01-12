@org.junit.Before
public void openPage() {
    browser.get(((BASE_URL) + "/overview/"));
    if (!(page.getNavMenu().isUserLoggedIn())) {
        page.getNavMenu().clickLogin();
        page.getLogin().loginWithEmail(cz.muni.proso.geography.test.USERNAME, cz.muni.proso.geography.test.PASSWORD);
        browser.get(((BASE_URL) + "/overview/"));
    }
    waitUntilPageLoaded();
}