private void updateAll() {
    if ((mPlayerService) != null) {
        android.util.Log.d("playlist", ("hasplaylist " + (org.oucho.musicplayer.PlayerService.hasPlaylist())));
        updateQueue();
        updateTrackInfo();
        setButtonDrawable();
        if (org.oucho.musicplayer.PlayerService.isPlaying()) {
            mHandler.post(mUpdateSeekBarRunnable);
        }
        updateShuffleButton();
        updateRepeatButton();
    }
}