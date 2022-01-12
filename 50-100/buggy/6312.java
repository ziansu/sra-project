public void showDialog() {
    javafx.stage.Stage stage = new javafx.stage.Stage();
    javafx.scene.layout.BorderPane root;
    try {
        root = ((javafx.scene.layout.BorderPane) (javafx.fxml.FXMLLoader.load(getClass().getClassLoader().getResource("fxmls/AddBook.fxml"))));
        javafx.scene.Scene scene = new javafx.scene.Scene(root, 275, 245);
        stage.setScene(scene);
        stage.setTitle("BookChat Client");
        stage.show();
    } catch (java.io.IOException e) {
        com.dkohut.bookchat.controllers.AddBookController.LOGGER.info(e.getMessage());
    }
}