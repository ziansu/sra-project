public void pass() {
    if (isGameDied()) {
        throw new org.innopolis.mammba.poker.engine.player.GameFlowError(GameFlowErrorType.gameFinished, "Game has finished");
    }
    checkMoveState();
    game.pass(id);
    state = PlayerState.active;
}