public void startPlayingAudio(java.lang.String id, java.lang.String file) {
    org.apache.cordova.media.AudioPlayer audio = getOrCreatePlayer(id, file);
    audio.startPlaying(file);
    getAudioFocus();
}