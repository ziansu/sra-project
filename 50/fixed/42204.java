@java.lang.Override
public void onPaused() {
    mPlayPause.setDisplayedChild(1);
    if ((mPlaylist) != null) {
        mPlaylist.pause();
    }
}