@java.lang.Override
public ar.edu.unrc.coeus.pig.IState computeAfterState(final ar.edu.unrc.coeus.pig.IState turnInitialState, final ar.edu.unrc.coeus.pig.IAction action) {
    final ar.edu.unrc.coeus.pig.GameState newGameState = ((ar.edu.unrc.coeus.pig.GameState) (turnInitialState.getCopy()));
    newGameState.setDicesToRoll(((ar.edu.unrc.coeus.pig.RollDicesAction) (action)).getNumVal());
    assert !(newGameState.isPlayer1Turn());
    newGameState.addPlayer2TotalReward(newGameState.getDicesToRoll());
    return newGameState;
}