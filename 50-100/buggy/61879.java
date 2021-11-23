@java.lang.Override
public void start(javafx.stage.Stage primaryStage) throws java.lang.Exception {
    javafx.scene.Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("/vue/VueMenu.fxml"));
    primaryStage.setTitle("TP3 - Fabienne Marquis et Gabriel Pariat");
    javafx.scene.image.Image icone = new javafx.scene.image.Image("/ressource/snowflake.png");
    primaryStage.getIcons().add(icone);
    primaryStage.setScene(new javafx.scene.Scene(root));
    primaryStage.show();
}