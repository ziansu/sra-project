private void notifyFinished(final boolean forcedStop) {
    if (forcedStop) {
        mHandler.removeCallbacksAndMessages(null);
    }
    mHandler.post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            if ((mResultListener) != null) {
                mResultListener.onGenerateResult(mHowMany, mTotalGenerated, forcedStop);
            }
            mService.onGeneratingFinished(forcedStop);
        }
    });
}