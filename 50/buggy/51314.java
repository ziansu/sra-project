@org.junit.Test
public void testBetRequest() throws java.lang.Exception {
    final com.wcs.poker.gamestate.GameState gameState = new com.wcs.poker.gamestate.GameState();
    org.junit.Assert.assertEquals(0, org.leanpoker.player.Player.betRequest(gameState));
}