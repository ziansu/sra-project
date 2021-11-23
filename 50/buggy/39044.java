public void messegeFieldAction(javafx.event.ActionEvent actionEvent) {
    java.lang.String message = messegeField.getText();
    messegeField.setText("");
    engine.sendMsg(message);
}