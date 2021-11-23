public java.lang.String getInputCommand() {
    if (((commandBox) == null) || (isEmpty(commandBox.getText()))) {
        return "";
    }
    return commandBox.getText();
}