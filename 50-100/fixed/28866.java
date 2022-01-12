@java.lang.Override
public VictoryScreenGraphic.VictoryState getWinner() {
    if ((boardCurrent.getWinner()) == null)
        return null;
    
    if ((boardCurrent.getWinner()) != (ai.getColor()))
        return VictoryScreenGraphic.VictoryState.VICTORY;
    
    if ((boardCurrent.getWinner()) == (ai.getColor()))
        return VictoryScreenGraphic.VictoryState.DEFEAT;
    
    return null;
}