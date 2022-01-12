@org.junit.Test
public void testPauseMusic() {
    try {
        mainFrame.MusicPlayer musicPlayer = new mainFrame.MusicPlayer("single_round_no_music.wav");
        musicPlayer.play();
        try {
            java.util.concurrent.TimeUnit.MILLISECONDS.sleep(10);
        } catch (java.lang.InterruptedException e) {
            fail();
        }
        musicPlayer.pause();
        assertFalse(musicPlayer.isRunning());
        assertEquals(musicPlayer.getFramePosition(), musicPlayer.getLastFrame());
    } catch (javax.sound.sampled.LineUnavailableException | java.io.IOException | javax.sound.sampled.UnsupportedAudioFileException e) {
        fail();
    }
}