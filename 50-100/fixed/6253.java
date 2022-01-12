@org.junit.Test
public void testSaveFileCreatesDirectoryAndFileIfNeeded() {
    java.io.File d = new java.io.File(gui.GUI.SAVE_FOLDER);
    this.deleteRecursivly(d);
    org.junit.Assert.assertFalse(d.exists());
    gui.GUI gui = new gui.GUI(false);
    org.junit.Assert.assertTrue(gui.saveFile());
    org.junit.Assert.assertTrue(d.exists());
    org.junit.Assert.assertTrue(new java.io.File(gui.GUI.SAVE_PATH).exists());
}