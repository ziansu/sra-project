@java.lang.Override
public void update() {
    de.htwg.se.moerakikemu.controller.State controllerState = myController.getState();
    switch (controllerState) {
        case game_finished :
            myController.setEnd(true);
            this.Quit();
            break;
        case player_occupied :
            drawCurrentState();
            break;
        case query_player_name :
            queryPlayerName();
            break;
        case player_won :
            this.printWinnerPopup();
            myController.newGame();
            break;
        default :
            break;
    }
}