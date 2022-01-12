@java.lang.Override
public void start(javafx.stage.Stage primaryStage) throws java.io.IOException {
    fxmlLoader = new javafx.fxml.FXMLLoader();
    root = ((javafx.scene.Parent) (fxmlLoader.load(this.getClass().getResource("/Views/loginView.fxml"))));
    ps = primaryStage;
    primaryStage.setScene(new javafx.scene.Scene(root));
    primaryStage.setTitle("Login");
    primaryStage.show();
}