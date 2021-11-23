@org.testng.annotations.Test
public void testForbiddenButtonsForDoctors() {
    java.lang.String error = browser.checkIfElementNotPresent(headerPage.actionsButton).concat(browser.checkIfElementNotPresent(headerPage.cardButton)).concat(browser.checkIfElementNotPresent(headerPage.manageButton));
    if (!(error.isEmpty())) {
        throw new java.lang.AssertionError(error);
    }
}