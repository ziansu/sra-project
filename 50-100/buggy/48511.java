public static com.uawebchallenge.bomberman.game.model.PlayerState execute(com.uawebchallenge.bomberman.game.model.PlayerCommand playerCommand, com.uawebchallenge.bomberman.game.model.PlayerState oldPlayerState, com.uawebchallenge.bomberman.game.model.GameField gameField, com.uawebchallenge.bomberman.game.model.GameConfig gameConfig) {
    com.uawebchallenge.bomberman.game.model.PlayerState newPlayerState = com.uawebchallenge.bomberman.game.model.PlayerCommandExecutor.execute(playerCommand, oldPlayerState, gameConfig);
    boolean validState = com.uawebchallenge.bomberman.game.model.PlayerStateValidator.isStateValid(newPlayerState, gameField, gameConfig);
    return validState ? newPlayerState : oldPlayerState;
}