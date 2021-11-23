public void movePlayerRight(javafx.event.ActionEvent actionEvent) {
    gameField.movePlayer(PlayerMoves.RIGHT);
    (correctorICoordAfterMove)++;
    updateVisualField();
}