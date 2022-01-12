@org.junit.Test(expected = catan.exception.GameException.class)
public void testSetReadyStatus_GameAlreadyStarted() throws java.lang.Exception {
    catan.domain.model.user.UserBean user = new catan.domain.model.user.UserBean(catan.services.impl.GameServiceImplTest.USER_NAME1, catan.services.impl.GameServiceImplTest.PASSWORD1);
    catan.domain.model.game.GameBean game = new catan.domain.model.game.GameBean(user, "TF3423", new java.util.Date(), catan.domain.model.game.types.GameStatus.PLAYING, 3, 4, catan.services.impl.GameServiceImplTest.DEFAULT_TARGET_VICTORY_POINTS);
    game.setGameId(1);
    game.getGameUsers().add(new catan.domain.model.game.GameUserBean(user, 1));
    when(gameDao.getGameByGameId(1)).thenReturn(game);
    gameService.updateGameUserStatus(user, "1", true);
}