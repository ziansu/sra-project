protected void processPlayRequest() {
    this.mDelayedStopHandler.removeCallbacksAndMessages(null);
    if (!(this.mIsStarted)) {
        this.mIsStarted = true;
    }
    if (!(this.mMediaSession.isActive())) {
        this.mMediaSession.setActive(true);
    }
    if (this.isIndexPlayable(this.mCurrentIndexOnQueue, this.mPlayingQueue)) {
        this.updateMetadata();
        this.mPlayback.play(this.mPlayingQueue.get(this.mCurrentIndexOnQueue));
    }
}