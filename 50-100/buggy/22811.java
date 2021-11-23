@javafx.fxml.FXML
void initialize() {
    assert (passwordTextField) != null : "fx:id=\"passwordTextField\" was not injected: check your FXML file \'loginFrame.fxml\'.";
    assert (loginBtn) != null : "fx:id=\"loginBtn\" was not injected: check your FXML file \'loginFrame.fxml\'.";
    assert (userIdTextField) != null : "fx:id=\"userIdTextField\" was not injected: check your FXML file \'loginFrame.fxml\'.";
    assert (AISFHSlable) != null : "fx:id=\"AISFHSlable\" was not injected: check your FXML file \'loginFrame.fxml\'.";
    Main.client.controller = this;
    userIdTextField.setText("404040404");
    passwordTextField.setText("oshrat404");
    application.UserController.CurrentUserID = "";
    permission = "";
}