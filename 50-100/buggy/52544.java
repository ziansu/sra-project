@org.junit.Test
public final void testGameUpdateAndDraw() {
    gsm = sem.group47.gamestate.GameStateManager.getInstance();
    org.junit.Assert.assertEquals(gsm.getCurrentState(), GameStateManager.MENUSTATE);
    gsm.setState(GameStateManager.LEVELSTATE);
    org.junit.Assert.assertEquals(gsm.getCurrentState(), GameStateManager.LEVELSTATE);
    for (int i = 0; i < 6000; i++) {
        gsm.update();
        gsm.draw(g2d);
    }
}