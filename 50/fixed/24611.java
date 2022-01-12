private void browseToPreviousCommand() {
    java.lang.String input = history.getPreviousUserInput().orElse(seedu.opus.ui.CommandBox.EMPTY_STRING);
    commandTextField.setText(input);
    commandTextField.end();
}