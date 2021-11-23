@javafx.fxml.FXML
private void pressedNum(javafx.event.ActionEvent event) {
    if (!(start)) {
        output.setText("");
        start = true;
    }else {
        java.lang.String value = ((javafx.scene.control.Button) (event.getSource())).getText();
        output.setText(((output.getText()) + value));
    }
}