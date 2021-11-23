@javafx.fxml.FXML
public final void resumeGame(final javafx.event.ActionEvent e) {
    java.io.File file = new java.io.File("save.txt");
    gamelogic.Game game = new gamelogic.Game();
    game.resume(file);
    controller.setScreen(Screens.Board);
}