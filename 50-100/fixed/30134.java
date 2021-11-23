@javafx.fxml.FXML
public void onBoxMenuItem() {
    arrriba.model.Box box = new arrriba.model.Box(100, 130, 70);
    obstacles.add(box);
    gameArea.getChildren().add(box.getShape());
    setPosition(box.getShape(), false);
}