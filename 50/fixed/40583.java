@javafx.fxml.FXML
public final void save(final javafx.event.ActionEvent e) {
    game.savegame();
    controller.setScreen(Screens.Home);
}