protected void processPauseRequest() {
    this.mPlayback.pause();
    this.mDelayedStopHandler.removeCallbacksAndMessages(null);
    this.mDelayedStopHandler.sendEmptyMessageDelayed(0, com.dreamdigitizers.androidbaselibrary.views.classes.services.ServiceMediaPlayer.STOP_DELAY);
}