@org.junit.Test
public void testEmptyMenu() {
    org.commcare.modern.session.SessionWrapper session = mApp.getSession();
    org.commcare.suite.model.MenuLoader menuLoader = new org.commcare.suite.model.MenuLoader(session.getPlatform(), session, "root", new org.commcare.backend.suite.model.test.EmptyAppElementsTests.TestLogger());
    this.mChoices = menuLoader.getMenus();
    org.junit.Assert.assertEquals("Number of Menu roots in empty example", this.mChoices, 1);
}