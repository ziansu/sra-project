@java.lang.Override
public void onDestroy() {
    this.processStopRequest(null);
    this.mDelayedStopHandler.removeCallbacksAndMessages(null);
    this.mMediaSession.release();
}