@javafx.fxml.FXML
private void handleLogoutButton() {
    javafx.stage.Stage stage;
    javafx.scene.Parent root;
    stage = ((javafx.stage.Stage) (logoutButton.getScene().getWindow()));
    try {
        logic.authentication.Authentication.setInstanceToNull();
        root = javafx.fxml.FXMLLoader.load(getClass().getResource("/view/userAccount/LoginUI.fxml"));
        javafx.scene.Scene scene = new javafx.scene.Scene(root);
        stage.setScene(scene);
        stage.show();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}