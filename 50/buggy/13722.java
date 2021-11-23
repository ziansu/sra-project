@org.robolectric.annotation.Implementation
public void _start() {
    if (checkStateError("start()", org.robolectric.shadows.ShadowMediaPlayer.startableStates)) {
        if ((state) == (org.robolectric.shadows.ShadowMediaPlayer.State.PLAYBACK_COMPLETED)) {
            startOffset = 0;
        }
        state = org.robolectric.shadows.ShadowMediaPlayer.State.STARTED;
        doStart();
    }
}