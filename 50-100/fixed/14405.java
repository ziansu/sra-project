@javafx.fxml.FXML
private void handleLoginButtonAction(javafx.event.ActionEvent event) {
    titleLabel_login.setText("Library System Login");
    titleLabel_login.setStyle("-fx-background-color:black;-fx-text-fikll:white");
    java.lang.String id = username_login.getText();
    java.lang.String pword = password_login.getText();
    try {
        login(id, pword);
    } catch (java.lang.Exception e) {
        titleLabel_login.setText(e.getMessage());
        titleLabel_login.setStyle("-fx-background-color:#d32f2f;-fx-text-fill:white");
        e.printStackTrace();
        return ;
    }
    closeLoginWindow();
    loadMain();
}