@java.lang.Override
public void start(javafx.stage.Stage primaryStage) throws java.lang.Exception {
    utils.HibernateUtil.openSession();
    javafx.scene.text.Font.loadFont(getClass().getResource("/fonts/Audiowide regular.ttf").toExternalForm(), 10);
    javafx.scene.Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("/fxml/login.fxml"));
    primaryStage.setTitle("Login - MMORPG");
    primaryStage.setScene(new javafx.scene.Scene(root, 960, 600));
    primaryStage.setResizable(false);
    primaryStage.show();
}