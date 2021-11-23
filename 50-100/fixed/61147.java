@org.junit.Test
public void showsMenuAgainWhenAnIncorrectOptionIsSelected() throws java.lang.Exception {
    application.load(catalogue);
    application.hasShownWelcomeMessage();
    application.hasShownMainMenu();
    application.selectIncorrectOption();
    application.hasShownInputErrorMessage();
    application.hasShownMainMenu();
    application.quit();
}