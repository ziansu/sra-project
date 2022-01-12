@org.junit.Test
public void testProcessInputDead() throws java.lang.Exception {
    player.die();
    for (int i = 0; i < 100; i++) {
        player.processInput();
    }
    verify(levelController, atLeastOnce()).gameOver();
    assertTrue(player.getGameOver());
}