public void handle(javafx.event.ActionEvent event) {
    application.Main.commandHandlerOld(txtF.getText());
    txtF.clear();
    java.lang.System.out.println(("textfield Text: " + (txtF.getText())));
    application.Main.wordHandler(txtF.getText());
    executeCommand(txtF.getText());
    txtF.clear();
}