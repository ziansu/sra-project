@javafx.fxml.FXML
private void numberFieldKeyPress(javafx.scene.input.KeyEvent ke) {
    if ((ke.getCode()) == (javafx.scene.input.KeyCode.ENTER)) {
        if ((selectedContact) == null) {
            return ;
        }
        changeNumber();
        showInfoInPanel();
    }
}