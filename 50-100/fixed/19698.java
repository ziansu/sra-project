@org.junit.Test
public void testSaveFileCreatesFileIfNeeded() {
    try {
        java.nio.file.Files.delete(java.nio.file.Paths.get(GUI.SAVE_PATH));
        gui.GUI gui = new gui.GUI(false);
        org.junit.Assert.assertTrue(gui.saveFile());
        java.io.File f = new java.io.File(gui.GUI.SAVE_PATH);
        org.junit.Assert.assertTrue(f.exists());
    } catch (java.io.IOException e) {
        e.printStackTrace();
        org.junit.Assert.fail("couldn't setup test");
    }
}