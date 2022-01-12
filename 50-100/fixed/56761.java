@java.lang.Override
public void doAction(game.model.User user) throws game.exception.ActionException {
    gameClient.ClientObjs.getMatch().updateFrom(match);
    enemies.remove(user);
    gameClient.ClientObjs.getMatch().setEnemies(enemies);
    if ((gameClient.controller.GameController.getGameController()) != null) {
        gameClient.controller.GameController.getGameController().onUpdateMatch();
    }
}