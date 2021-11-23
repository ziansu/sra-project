private com.telan.werewolf.result.WeBaseResult<com.telan.werewolf.game.process.GameInfo> quitGameBeforeStart(com.telan.werewolf.game.process.GameInfo gameInfo, long playerId) {
    com.telan.werewolf.result.WeBaseResult<com.telan.werewolf.game.process.GameInfo> result = new com.telan.werewolf.result.WeBaseResult();
    com.telan.werewolf.game.process.Player player = memGameManager.getPlayer(playerId);
    boolean deleteResult = playerManager.deletePlayerById(player.getPlayerDO());
    if (!deleteResult) {
        result.setErrorCode(WeErrorCode.SYSTEM_ERROR);
        return result;
    }
    memGameManager.removePlayer(player);
    gameInfo.removePlayer(player.getId());
    result.setValue(gameInfo);
    return result;
}