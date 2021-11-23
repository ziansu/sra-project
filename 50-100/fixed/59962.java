@org.junit.Test
public void demandLoginBeforeUsingSystem() throws java.lang.Exception {
    simulateLogin();
    simulateExitOption();
    userInteraction.execute();
    verify(display).waitForUserStringInput("Enter your library number: ", true);
    verify(display).waitForUserStringInput("Enter your password: ", true);
    verify(menu).showMenu();
}