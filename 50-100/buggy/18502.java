@java.lang.Override
public void start(javafx.stage.Stage primaryStage) {
    try {
        javafx.scene.Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("/view/LandingView.fxml"));
        javafx.scene.Scene scene = new javafx.scene.Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("AI User Identification");
        primaryStage.setOnCloseRequest(( e) -> javafx.application.Platform.exit());
        primaryStage.show();
    } catch (java.io.IOException e) {
        e.printStackTrace();
        return ;
    }
}