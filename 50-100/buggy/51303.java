@java.lang.Override
public void onSkipToNext() {
    super.onSkipToNext();
    com.gloriousfury.musicplayer.utils.StorageUtil storage = new com.gloriousfury.musicplayer.utils.StorageUtil(getContext());
    audioList = storage.loadAudio();
    audioIndex = storage.loadAudioIndex();
    skipToNext(audioList, audioIndex, getContext(), com.gloriousfury.musicplayer.service.MediaPlayerService.mediaPlayer);
    updateMetaData(mediaSession, activeAudio);
    buildNotification(PlaybackStatus.PLAYING);
}