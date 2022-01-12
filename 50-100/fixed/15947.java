@javafx.fxml.FXML
private void initialize() {
    javafx.scene.image.Image img = new javafx.scene.image.Image(awktal.mule.TownController.class.getResourceAsStream("town_pictures/town.png"));
    javafx.scene.layout.BackgroundSize size = new javafx.scene.layout.BackgroundSize(javafx.scene.layout.BackgroundSize.AUTO, javafx.scene.layout.BackgroundSize.AUTO, false, false, true, false);
    town_pane.setBackground(new javafx.scene.layout.Background(new javafx.scene.layout.BackgroundImage(img, javafx.scene.layout.BackgroundRepeat.NO_REPEAT, javafx.scene.layout.BackgroundRepeat.NO_REPEAT, javafx.scene.layout.BackgroundPosition.DEFAULT, size)));
}