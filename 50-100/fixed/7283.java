public void showPuzzleLayout() {
    try {
        javafx.fxml.FXMLLoader loader = new javafx.fxml.FXMLLoader();
        loader.setLocation(controller.MainApp.class.getResource("../view/PuzzleLayout.fxml"));
        javafx.scene.layout.AnchorPane anchorPane = loader.load();
        rootLayout.setCenter(anchorPane);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}