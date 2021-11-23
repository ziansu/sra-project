@java.lang.Override
public com.spanish_inquisition.battleship.server.game_states.GameState transform() {
    com.spanish_inquisition.battleship.server.Player currentPlayer = getCurrentPlayer();
    if (!(shootIfPlayerSentValidMessage(currentPlayer))) {
        return this;
    }
    return !(didPlayerWon(currentPlayer)) ? new com.spanish_inquisition.battleship.server.game_states.PlayerActionState(players, requestBus) : new com.spanish_inquisition.battleship.server.game_states.ResultState(players, requestBus);
}