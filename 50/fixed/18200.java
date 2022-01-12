public void setOurTurn() {
    synchronized(isOurTurn) {
        isOurTurn = true;
    }
    javafx.application.Platform.runLater(() -> gridPane.setStyle(Game.Controllers.BoardController.ourTurnGridStyle));
}