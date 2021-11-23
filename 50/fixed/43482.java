@org.junit.Test
public void testPlay() throws javafx.scene.media.MediaException {
    test.play();
    org.junit.Assert.assertTrue(test.isRunning());
}