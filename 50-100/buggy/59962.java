@org.junit.Test
public void demandLoginBeforeUsingSystem() throws java.lang.Exception {
    simulateLogin();
    simulateExitOption();
    userInteraction.execute();
    verify(display).waitForUserStringInput("Enter your library number: ");
    verify(display).waitForUserStringInput("Enter your password: ");
    verify(menu).showMenu();
}