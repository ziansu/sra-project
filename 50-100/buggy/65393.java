@javafx.fxml.FXML
public void backButtonClicked() {
    javafx.stage.Stage primaryStage = ((javafx.stage.Stage) (floorChoiceBox.getScene().getWindow()));
    try {
        loadScene(primaryStage, "/MainMenu.fxml", ((int) (anchorPane.getWidth())), ((int) (anchorPane.getHeight())));
    } catch (java.lang.Exception e) {
        java.lang.System.out.println("Cannot load main menu");
        e.printStackTrace();
    }
}