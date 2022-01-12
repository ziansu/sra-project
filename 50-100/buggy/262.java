private void initMainWindow() {
    javafx.fxml.FXMLLoader loader = new javafx.fxml.FXMLLoader();
    loader.setLocation(gui.Main.class.getResource("MainWindow.fxml"));
    try {
        mainWindow = ((javafx.scene.layout.BorderPane) (loader.load()));
        javafx.scene.Scene scene = new javafx.scene.Scene(mainWindow);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    } catch (java.io.IOException exc) {
    }
}