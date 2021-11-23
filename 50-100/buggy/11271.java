@org.junit.Before
public void setUp() throws java.lang.Exception {
    mediaPlayer = org.mockito.Mockito.mock(android.media.MediaPlayer.class);
    org.mockito.Mockito.when(mediaPlayer.getDuration()).thenReturn(org.mercycorps.translationcards.manager.MediaPlayerManagerTest.SOME_DURATION);
    translation = org.mockito.Mockito.mock(Dictionary.Translation.class);
    org.mockito.Mockito.when(translation.getFilename()).thenReturn(org.mercycorps.translationcards.manager.MediaPlayerManagerTest.ANY_FILENAME);
    mediaPlayerManager = new org.mercycorps.translationcards.media.MediaPlayerManager(mediaPlayer);
}