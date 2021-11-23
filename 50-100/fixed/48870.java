public void raise(int stake) {
    if (isGameDied()) {
        throw new org.innopolis.mammba.poker.engine.player.GameFlowError(GameFlowErrorType.gameFinished, "Game has finished");
    }
    checkMoveState();
    if (stake > (super.getUser().getBalance())) {
        throw new org.innopolis.mammba.poker.engine.player.GameFlowError(GameFlowErrorType.noEnoughMoney, "Not enough money");
    }
    state = PlayerState.active;
    game.raise(id, stake);
}