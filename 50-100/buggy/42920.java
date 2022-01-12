private synchronized void pause() {
    com.princecoder.nanodegree.spotifytreamer.utils.L.m(LOG_TAG, "pause");
    if ((isPrepared) && (mp.isPlaying())) {
        com.princecoder.nanodegree.spotifytreamer.utils.L.m(LOG_TAG, "Pausing the media player");
        mp.pause();
        StopProgressBar();
        updateUI();
    }
}