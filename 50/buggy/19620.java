public void eventHandlerPlayerMove(javafx.geometry.Point2D coordinate) {
    if ((newGameWindow.getSelectedColor()) != null) {
        gameRules.setPlayerMove(coordinate);
        boardWindow.addCircle(gameRules.getPlayerColor(), coordinate);
    }
}