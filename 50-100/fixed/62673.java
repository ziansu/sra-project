@java.lang.Override
public void update(java.util.Observable o, java.lang.Object arg) {
    if ((stateManager.getState()) instanceof client.state.SetupOneActivePlayerState) {
        startMove(PieceType.ROAD, true, true);
    }
    if (!(stateManager.getClientModel().newCli())) {
        this.initFromModel();
    }
}