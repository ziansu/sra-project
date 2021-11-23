public void showPuzzleLayout() {
    try {
        javafx.fxml.FXMLLoader loader = new javafx.fxml.FXMLLoader();
        loader.setLocation(controller.MainApp.class.getResource("../view/PuzzleLayout.fxml"));
        javafx.scene.layout.AnchorPane anchorPane = loader.load();
        rootLayout.setCenter(anchorPane);
        controller.PuzzleController puzzleController = loader.getController();
        puzzleController.setTilesList(this.tilesList);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}