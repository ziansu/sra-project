@org.junit.Test
public void testServerPoller() {
    shared.models.Game game = new shared.models.Game();
    client.serverProxy.FakeProxy proxy = new client.serverProxy.FakeProxy();
    client.serverPoller.ServerPoller poller = new client.serverPoller.ServerPoller(game, proxy, 1000);
    java.lang.String gameModelString = proxy.getGameModel(0);
    poller.updateModelTester(gameModelString);
    assertTrue(poller.GameModel.getPlayers().getPlayerByIndex(0).getName().equals("Sam"));
}