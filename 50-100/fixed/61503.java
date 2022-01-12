public void handle(javafx.event.ActionEvent event) {
    java.lang.System.out.println(("textfield Text: " + (txtF.getText())));
    scrollPane.setVisible(false);
    wordHandler(txtF, txtF.getText(), listView);
    executeCommand(txtF, txtF.getText(), primaryStage, popup, listView);
    handleCommandResponse(primaryStage, txtF, listView, scrollPane, popup, webengine);
    wordHandler(txtF, txtF.getText(), listView);
}