public void buttonPressed(com.testapps.wildWistEast.gameStates.ActionMessage actionMessage) {
    state = this.mainState;
    state.init();
    try {
        gameController.sendTurn(new com.testapps.wildWistEast.turn.TurnAction(actionMessage.getTurnAction(), cowboysBand.getMyCowboy().getID(), actionMessage.getBoardPos()), null, false);
        gameController.setMyTurn(false);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}