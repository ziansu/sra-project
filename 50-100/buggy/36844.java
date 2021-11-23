@javafx.fxml.FXML
private void parseCommand() {
    java.lang.String command = commandField.getText();
    commandController.setPreviousCommand(command);
    boolean result = commandController.executeCommand(command);
    if (result) {
        updateView();
        commandField.clear();
    }else {
        commandField.setStyle(taskcommando.view.ViewController.FOCUS_AND_TEXT_RED);
    }
    updateCommandAssistant(getCommandMessage(result));
    updateView();
}