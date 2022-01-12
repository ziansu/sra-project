@org.junit.Test
public final void testGameUpdateAndDraw() {
    gsm = new sem.group47.gamestate.GameStateManager();
    org.junit.Assert.assertEquals(gsm.getCurrentState(), GameStateManager.MENUSTATE);
    gsm.setState(GameStateManager.LEVEL1STATE);
    org.junit.Assert.assertEquals(gsm.getCurrentState(), GameStateManager.LEVEL1STATE);
    for (int i = 0; i < 6000; i++) {
        gsm.update();
        gsm.draw(g2d);
    }
}