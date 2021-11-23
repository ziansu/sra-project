private void initializeLayout(javafx.stage.Stage primaryStage) throws java.io.IOException {
    javafx.fxml.FXMLLoader loader = new javafx.fxml.FXMLLoader(this.getClass().getResource(com.gmail.terechsama.autoclicker.AutoClickerApp.LAYOUT_LOCATION));
    javafx.scene.Parent parent = loader.load();
    javafx.scene.Scene scene = new javafx.scene.Scene(parent);
    primaryStage.setScene(scene);
    primaryStage.show();
}