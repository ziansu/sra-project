@java.lang.Override
public void onFileContentChanged() {
    releasePlayer();
    preparePlayer();
    mPlaybackPosition = 0;
    player.setPlayWhenReady(mAutoplay);
}