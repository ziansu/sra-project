private void setupUserLabel() {
    this.usersTurn = new javafx.scene.control.Label("Yellow users turn");
    this.usersTurn.setLayoutY(20);
    this.usersTurn.setScaleX(3);
    this.usersTurn.setScaleY(3);
    if (!(gameStartedOnce)) {
        this.layout.getChildren().add(this.usersTurn);
    }
    this.usersTurn.setLayoutX((((windowWidth) / 2) - 40));
}