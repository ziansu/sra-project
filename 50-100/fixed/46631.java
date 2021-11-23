@org.junit.Test
public void testPauseMusic() {
    musicPlayer.play();
    try {
        java.util.concurrent.TimeUnit.MILLISECONDS.sleep(10);
    } catch (java.lang.InterruptedException e) {
        fail();
    }
    musicPlayer.pause();
    assertFalse(musicPlayer.isRunning());
    assertEquals(musicPlayer.getFramePosition(), musicPlayer.getLastFrame());
}