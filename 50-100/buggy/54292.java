@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    if ((mediaPlayer) != null) {
        stopMedia();
        mediaPlayer.release();
    }
    removeAudioFocus();
    if ((phoneStateListener) != null) {
        telephonyManager.listen(phoneStateListener, PhoneStateListener.LISTEN_NONE);
    }
    removeNotification();
    unregisterReceiver(becomingNoisyReceiver);
    unregisterReceiver(playNewAudio);
}