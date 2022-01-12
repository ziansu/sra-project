@java.lang.Override
public void start(final javafx.stage.Stage stage) throws java.lang.Exception {
    final javafx.scene.Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("/de/bht/fpa/mail/gruppe15/view/MainWindow.fxml"));
    final javafx.scene.Scene scene = new javafx.scene.Scene(root);
    stage.setScene(scene);
    stage.show();
}