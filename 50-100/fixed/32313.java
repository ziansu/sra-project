public void pause() {
    if (((mServiceState) == (com.linhphan.music.util.MusicServiceState.prepared)) || ((mServiceState) == (com.linhphan.music.util.MusicServiceState.playing))) {
        mp.pause();
        mServiceState = com.linhphan.music.util.MusicServiceState.paused;
    }
    terminateThread();
    notifyMediaPlayerPaused(true);
    showCustomNotification(getApplicationContext());
}