@java.lang.Override
public void play() {
    if (((mMediaPlayer) != null) && ((mCurrentPlayingSong) != null)) {
        if (mPlaySameSong) {
            playResume();
        }else {
            playNew(false);
        }
    }
}