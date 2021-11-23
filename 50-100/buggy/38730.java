private void skipToPrevious() {
    if ((audioIndex) == 0) {
        audioIndex = (audioList.size()) - 1;
        activeAudio = audioList.get(audioIndex);
    }else {
        activeAudio = audioList.get((--(audioIndex)));
    }
    new com.banagas.trustinpod.util.StorageUtil(getApplicationContext()).storeAudioIndex(audioIndex);
    stopMedia();
    mediaPlayer.reset();
    initMediaPlayer();
}