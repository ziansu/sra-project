private void addMaxPlayers() {
    org.junit.Assert.assertTrue(gameModel.playerLimitIs(maxPlayers));
    for (int i = 1; i <= (playerLimit); ++i) {
        gameModel.handlePlayerJoinGameRequest(new com.forerunnergames.peril.common.net.events.client.request.PlayerJoinGameRequestEvent(("TestPlayer" + i)));
    }
    org.junit.Assert.assertTrue(gameModel.isFull());
}