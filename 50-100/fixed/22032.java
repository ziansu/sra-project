private void displayLoginScene(javafx.stage.Stage stage) throws java.io.IOException {
    javafx.scene.Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("MainMenu/MainMenu.fxml"));
    javafx.scene.Scene scene = new javafx.scene.Scene(root);
    stage.setTitle("Critical Care Audit Tool - CONFIDENTIAL");
    stage.setScene(scene);
    stage.show();
}