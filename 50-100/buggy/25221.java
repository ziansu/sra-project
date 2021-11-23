@java.lang.Override
public void playNext() {
    if ((mPlayNextByDeleteing) && ((mCurrentPlayMode) == (com.scott.su.smusic.constant.PlayMode.RepeatOne))) {
        mPreviousPlayingSong = mCurrentPlayingSong;
        mCurrentPlayingSong = com.scott.su.smusic.util.MusicPlayUtil.getNextSong(mCurrentPlayingSong, mPlayListSongs, PlayMode.RepeatAll);
        mPlayNextByDeleteing = false;
    }else {
        mPreviousPlayingSong = mCurrentPlayingSong;
        mCurrentPlayingSong = com.scott.su.smusic.util.MusicPlayUtil.getNextSong(mCurrentPlayingSong, mPlayListSongs, mCurrentPlayMode);
    }
    playNew();
}