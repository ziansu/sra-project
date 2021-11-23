public void movePlayerRight(javafx.event.ActionEvent actionEvent) {
    if (gameField.movePlayer(PlayerMoves.RIGHT)) {
        (correctorICoordAfterMove)++;
        updateVisualField();
    }
}