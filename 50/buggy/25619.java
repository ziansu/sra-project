@com.google.common.eventbus.Subscribe
private void handleIncorrectCommandAttempted(main.commons.events.ui.IncorrectCommandAttemptedEvent event) {
    logger.info(main.commons.core.LogsCenter.getEventHandlingLogMessage(event, ("Invalid command: " + (previousCommandTest))));
    setStyleToIndicateIncorrectCommand();
    commandTextField.setText("");
}