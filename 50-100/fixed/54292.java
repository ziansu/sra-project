@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    if ((mediaPlayer) != null) {
        stopMedia();
        mediaPlayer.release();
    }
    removeAudioFocus();
    removeNotification();
    unregisterReceiver(becomingNoisyReceiver);
    unregisterReceiver(playNewAudio);
}