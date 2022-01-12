@java.lang.Override
public ar.edu.unrc.coeus.pig.IState computeAfterState(final ar.edu.unrc.coeus.pig.IState turnInitialState, final ar.edu.unrc.coeus.pig.IAction action) {
    final ar.edu.unrc.coeus.pig.GameState newGameState = ((ar.edu.unrc.coeus.pig.GameState) (turnInitialState.getCopy()));
    assert !(newGameState.isPlayer1Turn());
    newGameState.setDicesToRoll(((ar.edu.unrc.coeus.pig.RollDicesAction) (action)).getNumVal());
    newGameState.addPlayer2TotalReward(newGameState.getDicesToRoll());
    return newGameState;
}