@org.junit.Test
public void testPlay() throws javafx.scene.media.MediaException {
    nl.tudelft.ti2206.group9.audio.AudioPlayerTest.testPath = "src/main/resources/" + "nl/tudelft/ti2206/group9/audio/soundtrack.aiff";
    test = new nl.tudelft.ti2206.group9.audio.AudioPlayer(nl.tudelft.ti2206.group9.audio.AudioPlayerTest.testPath);
    test.play();
    org.junit.Assert.assertTrue(test.isRunning());
}