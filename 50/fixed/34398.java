@java.lang.Override
public void onPlaying() {
    mPlayPause.setDisplayedChild(0);
    if ((mPlaylist) != null) {
        mPlaylist.play();
    }
}