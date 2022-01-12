public void actionPerformed(java.awt.event.ActionEvent event) {
    java.lang.String text = textField.getText();
    java.lang.String returnedText = ButtonAction.consoleTextFieldAction(text);
    if ((!(returnedText.isEmpty())) || (returnedText != null)) {
        txtrConsole.append((returnedText + "\n"));
    }
    textField.setText("");
}