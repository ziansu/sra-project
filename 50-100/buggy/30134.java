@javafx.fxml.FXML
public void onBoxMenuItem() {
    arrriba.model.Box box = new arrriba.model.Box(100, 130, 70);
    obstacles.add(box);
    javafx.scene.shape.Rectangle rect = ((javafx.scene.shape.Rectangle) (box.getShape()));
    shapes.add(rect);
    gameArea.getChildren().add(rect);
    setPosition(rect);
}