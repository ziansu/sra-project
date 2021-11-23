@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void testLogOnBadUserName() {
    cmcControllerTests.PersonUI ui = controller.logOn("NotAUser", "NotAPassword");
}