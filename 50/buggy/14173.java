public void processInputedMessage() {
    if ((consoleListener) != null) {
        java.lang.String text = textField.getText();
        java.lang.System.out.println("heya");
        consoleListener.processInputMessage(text, this);
    }
    textField.setText("");
}