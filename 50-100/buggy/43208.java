@org.testng.annotations.Test
public void testForbiddenButtonsForUnregisteredUsers() {
    java.lang.String error = browser.checkIfElementNotPresent(headerPage.actionsButton).concat(browser.checkIfElementNotPresent(headerPage.cardButton)).concat(browser.checkIfElementNotPresent(headerPage.manageButton)).concat(browser.checkIfElementNotPresent(headerPage.patientsButton));
    if (!(error.isEmpty())) {
        throw new java.lang.AssertionError(error);
    }
}