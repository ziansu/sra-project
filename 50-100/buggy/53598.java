private void stopBASS() {
    audioManager.abandonAudioFocus(afListener);
    try {
        unregisterReceiver(speakerChecker);
    } catch (java.lang.IllegalArgumentException ignored) {
    }
    reconnectCancel = true;
    com.un4seen.bass.BASS.BASS_StreamFree(chan);
    com.un4seen.bass.BASS.BASS_Free();
    isPlaying = false;
    updateUI(Constants.UI.BUTTON, null);
}