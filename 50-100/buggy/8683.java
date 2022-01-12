@java.lang.Override
protected void onPause() {
    android.support.v4.content.LocalBroadcastManager.getInstance(this).unregisterReceiver(mAudioReceiver);
    if (((mAudioController) != null) && (mAudioController.isAudioPlaying())) {
        startService(com.bandonleon.audioservice.AudioService.getStartIdleIntent(this));
        mAudioController.startForegroundService(com.bandonleon.audioservice.MainActivity.AUDIO_TRACK_TITLE);
    }
    super.onPause();
}