@javafx.fxml.FXML
private void onLogin() {
    loginListener.onLogin(txtUsername.getText(), txtServer.getText());
}