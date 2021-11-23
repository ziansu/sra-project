public void initRootLayout() {
    try {
        mainController.setMainApp(this);
        javafx.fxml.FXMLLoader loader = new javafx.fxml.FXMLLoader();
        loader.setLocation(this.getClass().getResource("MainWindow.fxml"));
        rootLayout = ((javafx.scene.layout.AnchorPane) (loader.load()));
        mainController.setMainApp(this);
        javafx.scene.Scene scene = new javafx.scene.Scene(rootLayout);
        primaryStage.setScene(scene);
        primaryStage.show();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}