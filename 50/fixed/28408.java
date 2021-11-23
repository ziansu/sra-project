private void updateSeekTime(android.content.Intent intent) {
    int seekTimeMsec = getSeekTime(intent);
    if (seekTimeMsec >= 0) {
        mediaPlayer.seekTo(seekTimeMsec);
    }
}