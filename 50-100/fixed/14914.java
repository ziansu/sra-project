private void skipToNext() {
    if ((audioIndex) == ((audioList.size()) - 1)) {
        audioIndex = 0;
        activeAudio = audioList.get(audioIndex);
    }else {
        activeAudio = audioList.get((++(audioIndex)));
    }
    new com.banagas.trustinpod.util.StorageUtil(getApplicationContext()).storeAudioIndex(audioIndex);
    stopMedia();
    mediaPlayer.reset();
    initMediaPlayer(true);
}