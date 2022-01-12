@javafx.fxml.FXML
private void handleSendMessage(javafx.event.ActionEvent actionEvent) {
    java.lang.String message = messageStage.getText();
    try {
        mClientParseData.sendMessage(new com.jangle.client.Message(0, message, 0, 0));
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    messageStage.clear();
}