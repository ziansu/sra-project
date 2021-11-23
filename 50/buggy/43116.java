@java.lang.Override
public void run() {
    displayWelcomeMessage();
    com.nexus.simplify.Logic logic = new com.nexus.simplify.Logic();
    com.nexus.simplify.CommandResult initialFeedback = logic.initialise(com.nexus.simplify.UI.INPUT_FILE_NAME);
    if (initialFeedback != null) {
        displayFeedback(initialFeedback);
    }
}