private void autoComplete() {
    java.lang.String currentString = commandTextField.getText();
    java.lang.String completedCommand = commandTextField.getText();
    boolean found = false;
    for (java.lang.String command : commands) {
        if (command.startsWith(currentString)) {
            if (found) {
                return ;
            }else {
                completedCommand = command;
                found = true;
            }
        }
    }
    commandTextField.setText(completedCommand);
    commandTextField.end();
}