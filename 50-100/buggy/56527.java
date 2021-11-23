public void stopPlay() {
    if ((mCurState) == (com.shimnssso.wordsmaster.ForegroundService.STATE_PLAY)) {
        mPlayer.stop();
        mPlayer.release();
    }else
        if ((mCurState) == (com.shimnssso.wordsmaster.ForegroundService.STATE_TTS)) {
            mTts.stop();
        }
    
    mCurState = com.shimnssso.wordsmaster.ForegroundService.STATE_IDLE;
}