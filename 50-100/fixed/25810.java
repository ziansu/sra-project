@org.junit.Test
public void testHappyLoad() {
    gui.GUI gui = new gui.GUI(false);
    gui.saveFile();
    game.Game before = new game.Game(gui.getGame());
    org.junit.Assert.assertTrue(gui.loadFile(new java.io.File(gui.GUI.SAVE_PATH)));
    org.junit.Assert.assertEquals(before, gui.getGame());
}