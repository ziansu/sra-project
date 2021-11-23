@org.testng.annotations.Test
public void testPrimaryAdminElements() {
    java.lang.String error = browser.checkIfElementNotPresent(headerPage.actionsButton).concat(browser.checkIfElementNotPresent(adminPage.allUsersTable));
    if (error.isEmpty()) {
        throw new java.lang.AssertionError(error);
    }
}