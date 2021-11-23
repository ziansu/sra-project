@java.lang.Override
public void onSkipToPrevious() {
    super.onSkipToPrevious();
    skipToPrevious(audioList, audioIndex, getApplicationContext(), com.gloriousfury.musicplayer.service.MediaPlayerService.mediaPlayer);
    updateMetaData(mediaSession, activeAudio);
    buildNotification(PlaybackStatus.PLAYING);
}