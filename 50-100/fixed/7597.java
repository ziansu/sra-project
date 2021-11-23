@org.junit.Test
public void testCreateListener() {
    org.robolectric.shadows.ShadowMediaPlayer.CreateListener createListener = org.mockito.Mockito.mock(ShadowMediaPlayer.CreateListener.class);
    org.robolectric.shadows.ShadowMediaPlayer.setCreateListener(createListener);
    android.media.MediaPlayer newPlayer = new android.media.MediaPlayer();
    org.robolectric.shadows.ShadowMediaPlayer shadow = org.robolectric.Shadows.shadowOf(newPlayer);
    org.mockito.Mockito.verify(createListener).onCreate(newPlayer, shadow);
}