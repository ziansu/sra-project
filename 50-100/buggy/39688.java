@org.junit.Test
public void testProcessInputDead() throws java.lang.Exception {
    player.die();
    for (int i = 0; i < 100; i++) {
        player.processInput();
    }
    org.mockito.Mockito.verify(levelController, org.mockito.Mockito.atLeastOnce()).gameOver();
    assertTrue(player.getGameOver());
}