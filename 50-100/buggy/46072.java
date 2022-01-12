@javafx.fxml.FXML
public void onBarrelMenuItem() {
    arrriba.model.Barrel barrel = new arrriba.model.Barrel(50, 165, 10);
    obstacles.add(barrel);
    javafx.scene.shape.Circle circle = ((javafx.scene.shape.Circle) (obstacles.get(0).getShape()));
    shapes.add(circle);
    gameArea.getChildren().add(circle);
    setPosition(circle, true);
}