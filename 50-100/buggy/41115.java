private void nextSong() {
    android.util.Log.i(com.tan.musicplayer.playService.PlayService.TAG, "nextSong: ");
    if ((mSongs) == null) {
        android.util.Log.i(com.tan.musicplayer.playService.PlayService.TAG, "nextSong: mSongs == null");
        return ;
    }
    int index = mCurrentSong;
    index++;
    if (index >= (mSongs.size())) {
        index = 0;
    }
    playSong(index);
}