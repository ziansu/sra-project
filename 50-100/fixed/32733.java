@java.lang.Override
public void run() {
    javafx.scene.Parent root;
    try {
        root = javafx.fxml.FXMLLoader.load(getClass().getClassLoader().getResource("Main.fxml"));
        javafx.scene.Scene scene = new javafx.scene.Scene(root);
        Launcher.stage.setScene(scene);
        Launcher.stage.setMaximized(false);
        Launcher.stage.setMaximized(true);
        Launcher.stage.show();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}