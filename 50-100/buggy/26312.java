private void startAudioService() {
    audioIndex = storage.loadAudioIndex();
    if (!(serviceBound)) {
        com.gloriousfury.musicplayer.utils.StorageUtil storage = new com.gloriousfury.musicplayer.utils.StorageUtil(this);
        storage.storeAudio(audioList);
        storage.storeAudioIndex(audioIndex);
        android.content.Intent playerIntent = new android.content.Intent(this, com.gloriousfury.musicplayer.service.MediaPlayerService.class);
        playerIntent.putExtra(DONOT_PLAY_CHECKER, "donotplay");
        startService(playerIntent);
        bindService(playerIntent, serviceConnection, Context.BIND_AUTO_CREATE);
    }
}