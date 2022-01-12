protected static Controller.AbstractController switchToScene(javafx.stage.Stage primaryStage, java.lang.String pathToView) throws java.io.IOException {
    javafx.fxml.FXMLLoader loader;
    javafx.scene.Parent root;
    loader = new javafx.fxml.FXMLLoader(Controller.SceneSwitcher.class.getResource(Controller.SceneSwitcher.AdminWelcomeViewPath));
    root = loader.load();
    javafx.scene.Scene scene = new javafx.scene.Scene(root);
    primaryStage.setScene(scene);
    Controller.AbstractController controller = loader.getController();
    controller.setStage(primaryStage);
    return controller;
}