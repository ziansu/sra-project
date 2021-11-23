@org.junit.Test
public void testAddPlayer() throws java.lang.Exception {
    com.jcwhatever.nucleus.sounds.SoundSettings settings = new com.jcwhatever.nucleus.sounds.SoundSettings();
    com.jcwhatever.nucleus.sounds.playlist.SimplePlayList playList = new com.jcwhatever.nucleus.sounds.playlist.SimplePlayList(_plugin, com.jcwhatever.nucleus.sounds.SoundManager.getSounds());
    org.junit.Assert.assertEquals(null, playList.getSoundQueue(_player));
    org.junit.Assert.assertNotEquals(null, playList.addPlayer(_player, settings));
    org.junit.Assert.assertNotEquals(null, playList.getSoundQueue(_player));
}