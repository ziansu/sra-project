@javafx.fxml.FXML
public final void resumeGame(final javafx.event.ActionEvent e) {
    gamelogic.Game game = new gamelogic.Game();
    game.resume();
    controller.setScreen(Screens.Board);
}