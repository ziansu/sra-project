public void playerStop() {
    if (((mPlayer) != null) && (mPlayer.isPlaying())) {
        mPlayer.release();
        mHandler.removeCallbacks(mHighlightTask);
        if ((mTextToSpeech) != null) {
            mTextToSpeech.stop();
            mTextToSpeech.shutdown();
        }
    }
}