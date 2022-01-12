@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    audioIndex = new com.gloriousfury.musicplayer.utils.StorageUtil(getApplicationContext()).loadAudioIndex();
    if (((audioIndex) != (-1)) && ((audioIndex) < (audioList.size()))) {
        activeAudio = audioList.get(audioIndex);
    }else {
        stopSelf();
    }
    stopMedia();
    com.gloriousfury.musicplayer.service.MediaPlayerService.mediaPlayer.reset();
    initMediaPlayer();
    updateMetaData(mediaSession, activeAudio);
    buildNotification(PlaybackStatus.PLAYING);
}