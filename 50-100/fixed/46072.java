@javafx.fxml.FXML
public void onBarrelMenuItem() {
    arrriba.model.Barrel barrel = new arrriba.model.Barrel(50, 165, 10);
    obstacles.add(barrel);
    gameArea.getChildren().add(barrel.getShape());
    setPosition(barrel.getShape(), true);
}