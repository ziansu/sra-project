@java.lang.Override
public void update(java.util.Observable o, java.lang.Object arg) {
    shared.game.map.Index currentTurn = ModelFacade.facace_currentgame.currentgame.getModel().getTurntracker().getCurrentTurn();
    shared.game.player.Player player = ModelFacade.facace_currentgame.getMyplayers().get(currentTurn);
    if (LoginController.REALPURENAME.equals(player.getName())) {
        updateGameState("End Turn", true);
    }
}