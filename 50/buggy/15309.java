public void movePlayerTop(javafx.event.ActionEvent actionEvent) {
    gameField.movePlayer(PlayerMoves.TOP);
    (correctorJCoordAfterMove)--;
    updateVisualField();
}