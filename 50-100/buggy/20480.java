protected void showControls() {
    try {
        javafx.fxml.FXMLLoader loader = new javafx.fxml.FXMLLoader();
        loader.setLocation(com.simulus.MainApp.class.getResource("view/Controls.fxml"));
        javafx.scene.layout.AnchorPane controls = loader.load();
        rootLayout.setRight(controls);
        controlsController = loader.getController();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}