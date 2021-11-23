private long findCurrentGameId(long userId) {
    com.telan.werewolf.game.process.Player player = memGameManager.getPlayerByUserId(userId, 0);
    if (player == null) {
        return 0;
    }
    return player.getGameId();
}